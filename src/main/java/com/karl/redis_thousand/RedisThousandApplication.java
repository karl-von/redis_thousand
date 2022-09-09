package com.karl.redis_thousand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.karl.redis_thousand.mapper")
@SpringBootApplication
public class RedisThousandApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisThousandApplication.class, args);
    }

}
