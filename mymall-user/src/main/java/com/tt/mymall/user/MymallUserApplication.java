package com.tt.mymall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.tt.mymall.user.mapper")
public class MymallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallUserApplication.class, args);
    }

}
