package com.tman.gulimall.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tman.gulimall.coupon")
@SpringBootApplication //(exclude = GlobalTransactionAutoConfiguration.class)
public class GulimallAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallAuthApplication.class, args);
    }
}
