package com.tman.gulimall.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tman.gulimall.coupon")
@SpringBootApplication //(exclude = GlobalTransactionAutoConfiguration.class)
public class GulimallSeckillApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallSeckillApplication.class, args);
    }
}
