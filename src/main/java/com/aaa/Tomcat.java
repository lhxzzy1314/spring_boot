package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 将当前类声明成springboot的应用程序
@SpringBootApplication
@MapperScan("com.aaa.dao")
public class Tomcat {

    public static void main(String[] args) {
        // 运行spring程序
        SpringApplication.run(Tomcat.class, args);
    }

}
