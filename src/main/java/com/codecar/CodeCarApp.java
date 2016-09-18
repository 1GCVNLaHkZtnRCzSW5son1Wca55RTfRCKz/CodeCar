package com.codecar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan("com.codecar")
public class CodeCarApp {
    public static void main(String[] args) {
        SpringApplication.run(CodeCarApp.class, args);
    }
}
