package com.tman.gulimall.search;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.aggregations.metrics.Avg;
import org.elasticsearch.search.aggregations.metrics.AvgAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@Slf4j
@SpringBootTest
public class GulimallSearchApplicationTests {

    @Autowired
    private RestHighLevelClient esRestClient;

    @Test
    public void searchTest() throws IOException {
        SearchRequest request = new SearchRequest();
        request.indices("gulimall");

        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.matchQuery("name", "苹果14"));

        TermsAggregationBuilder nameAgg = AggregationBuilders.terms("nameAgg").field("name.keyword").size(10);
        sourceBuilder.aggregation(nameAgg);

        AvgAggregationBuilder avgAgg = AggregationBuilders.avg("weightAvgAgg").field("weight");
        sourceBuilder.aggregation(avgAgg);


        request.source(sourceBuilder);

        log.info("检索条件：\n{}", sourceBuilder);

        SearchResponse response = esRestClient.search(request, RequestOptions.DEFAULT);

        log.info("检索结果：\n{}", response.toString());
        SearchHit[] hits = response.getHits().getHits();

        for (SearchHit hit : hits) {
            Product product = JSON.parseObject(hit.getSourceAsString(), Product.class);
            log.info(JSON.toJSONString(product));
        }

        Aggregations aggregations = response.getAggregations();
        Terms nameAgg1 = aggregations.get("nameAgg");
        for (Terms.Bucket bucket : nameAgg1.getBuckets()) {
            log.info("产品名：{}", bucket.getKey());
        }
        Avg avgAgg1 = aggregations.get("weightAvgAgg");
        log.info("平均重量：{}", avgAgg1.getValue());
    }

    @Test
    public void indexTest() throws IOException {
        IndexRequest indexRequest = new IndexRequest("gulimall");
        indexRequest.id("2");
        Product product = new Product("苹果14", 552, "苹果14远峰蓝 Pro Max", "http://www.baicu.com");
        String jsonString = JSON.toJSONString(product);
        indexRequest.source(jsonString, XContentType.JSON);
        IndexResponse response = esRestClient.index(indexRequest, RequestOptions.DEFAULT);

        log.info("操作结果：{}", response);

    }


}

@Data
@AllArgsConstructor
class Product {
    private String name;
    private Integer weight;
    private String desc;
    private String iconUrl;
}
