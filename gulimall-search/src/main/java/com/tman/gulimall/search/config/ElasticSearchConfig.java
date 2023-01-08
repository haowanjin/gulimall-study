package com.tman.gulimall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author haowanjin
 * @date 2023/1/8 14:35
 * @description
 */


@Configuration
public class ElasticSearchConfig {


    @Bean
    public RestHighLevelClient esRestClient() {

        RestHighLevelClient esRestClient = new RestHighLevelClient(RestClient.builder(
                new HttpHost("192.168.171.127", 9200)
        ));

        return esRestClient;
    }
}
