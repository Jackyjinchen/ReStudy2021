package com.jacky.Other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
// Aware的使用
@Component
public class Aware implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String s) {
        System.out.println("当前bean名称为"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
