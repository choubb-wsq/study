package com.example.cn.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "com.example.cn.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {

        log.info("开始启动!");

        SpringApplication.run(DemoApplication.class, args);
    }

}
