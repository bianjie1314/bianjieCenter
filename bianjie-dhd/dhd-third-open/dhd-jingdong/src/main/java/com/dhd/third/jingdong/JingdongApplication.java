package com.dhd.third.jingdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.dhd.third.jingdong.mapper")
@EnableDiscoveryClient
public class JingdongApplication {

    public static void main(String[] args) {
        SpringApplication.run(JingdongApplication.class, args);
    }
}
