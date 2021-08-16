package com.jacky.testSpring;

import com.jacky.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLifecircle {

    @Test
    public void testLife() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        System.out.println("4,获取创建bean对象");
        System.out.println(user);
        context.close();
    }
}
