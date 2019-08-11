package com.linwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.linwei.firstappproject.*")
@ServletComponentScan(basePackages = "com.linwei.firstappproject.*")
public class LinweiWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinweiWebApplication.class, args);
    }

}
