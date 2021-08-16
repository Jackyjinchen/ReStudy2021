package com.jacky.hello.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/14
 * @Content: Native Servlet Listener
 */
@WebListener
public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("上下文初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("上下文销毁");
    }
}
