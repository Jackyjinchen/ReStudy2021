package com.jacky;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBT implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("timi");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
