package com.jacky.hello.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/15
 * @Content:
 */
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("ApplicationListener.onApplicationEvent");
    }
}
