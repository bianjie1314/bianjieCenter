package com.bianjie.phone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bianjie")
@MapperScan("com.bianjie.orm.mapper")
public class BianjiePhoneApplication {
    //
    public static void main(String[] args) {
        SpringApplication.run(BianjiePhoneApplication.class, args);
    }
}
