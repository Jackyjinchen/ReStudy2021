package com.jacky.Test;

import com.jacky.Entity.User;
import com.jacky.Service.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testJdbcTemplate {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Service service = context.getBean("service",Service.class);
        User user = new User();
        user.setUserId("123");
        user.setUserName("jackyjinchen");
        user.setUserAge("26");
        service.addUser(user);
    }

    @Test
    public void testUpadate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Service service = context.getBean("service",Service.class);
        User user = new User();
        user.setUserId("123");
        user.setUserName("jackyjinchen");
        user.setUserAge("27");
        service.updateUser(user);

    }

    @Test
    public void testDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Service service = context.getBean("service",Service.class);
        service.deleteById("123");
    }

    @Test
    public void testQueryObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Service service = context.getBean("service",Service.class);
        System.out.println(service.queryById("1"));
    }

    @Test
    public void testQueryList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Service service = context.getBean("service",Service.class);
        for (User user : service.queryAll()) {
            System.out.println(user);
        }
    }
}
