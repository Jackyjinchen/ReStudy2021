package com.jacky.hello;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

// 添加原生servlet支持
@ServletComponentScan(basePackages = "com.jacky.hello")
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        // 返回了IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(HelloApplication.class, args);

//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
    }

}
