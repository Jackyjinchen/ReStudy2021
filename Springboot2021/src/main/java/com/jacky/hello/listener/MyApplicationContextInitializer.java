package com.jacky.hello.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/15
 * @Content:
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("ApplicationContext.initialize");
    }
}
