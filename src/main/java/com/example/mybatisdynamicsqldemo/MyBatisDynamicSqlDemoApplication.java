package com.example.mybatisdynamicsqldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.mybatisdynamicsqldemo.mapper"})
public class MyBatisDynamicSqlDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyBatisDynamicSqlDemoApplication.class, args);
  }

}
