package com.dhd.third.taobao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 淘宝模块
 * @author linmingxi
 * 2021/01/04
 */
@SpringBootApplication
@MapperScan("com.dhd.third.taobao.mapper")
public class TaobaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaobaoApplication.class, args);
    }
}
