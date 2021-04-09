package com.dhd.schedule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author linmingxi
 * 2021/04/08
 */
@EnableCaching // 启用缓存功能
@EnableScheduling // 开启定时任务功能
@MapperScan("com.dhd.schedule.mapper")
@SpringBootApplication(scanBasePackages = "com.dhd")
public class ScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
    }

}