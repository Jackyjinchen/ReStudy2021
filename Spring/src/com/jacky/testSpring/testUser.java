package com.jacky.testSpring;

import com.jacky.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser {

    @Test
    public void testSG() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.setName("jackyjinchen");
        System.out.println(user.getName());
        System.out.println(user.getProps());
        System.out.println(user.getId());
    }
}
