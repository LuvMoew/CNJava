package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "com.example.bkt"})
@EntityScan("com.example.bkt.model")
@EnableJpaRepositories("com.example.bkt.repository")
public class ThucHanh4BaiSo9Application {

    public static void main(String[] args) {
        SpringApplication.run(ThucHanh4BaiSo9Application.class, args);
    }

} 