package com.jacky.hello.config;

import com.jacky.hello.bean.Car;
import com.jacky.hello.bean.Pet;
import com.jacky.hello.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@EnableConfigurationProperties(Car.class)
@Configuration
public class MyConfig {

//    @Bean
//    public User user() {
//        User user = new User("张三", 12, "zhangsan@163.com");
//        user.setPet(pet());
//        return user;
//    }
//
//    @Bean("tom")
//    public Pet pet() {
//        return new Pet("tomcat");
//    }
}
