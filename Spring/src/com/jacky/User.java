package com.jacky;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class User {
    private String name;
    private String props;
    private String id;

    public User() {
        System.out.println("1,构造bean");
    }

    public void initMethod() {
        System.out.println("3,执行初始化");
    }

    public void destroyMethod() {
        System.out.println("5,执行销毁");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        System.out.println("2,执行set方法");
        this.props = props;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}