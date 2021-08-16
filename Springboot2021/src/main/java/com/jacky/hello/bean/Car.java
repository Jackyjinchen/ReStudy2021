package com.jacky.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/9
 * @Content: 配置绑定，将properties中内容封装到JavaBean中
 * @ConfigurationProperties: 配置绑定
 */
@ConfigurationProperties("mycar")
public class Car {
    private String name;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
