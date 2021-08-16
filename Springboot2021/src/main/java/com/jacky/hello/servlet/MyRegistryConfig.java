package com.jacky.hello.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import java.util.Arrays;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/14
 * @Content: 使用Bean方式创建Native Servlet
 */
@Configuration
public class MyRegistryConfig {

    @Bean
    public ServletRegistrationBean myservletBean() {
        Servlet servlet = new MyServlet();
        return new ServletRegistrationBean(servlet,"/servletOther");
    }

    @Bean
    public FilterRegistrationBean myfilterBean() {
        Filter filter = new ServletFilter();
        FilterRegistrationBean bean = new FilterRegistrationBean(filter);
        bean.setUrlPatterns(Arrays.asList("/my","/css/*"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean myListenerBean() {
        ServletListener listener = new ServletListener();
        return new ServletListenerRegistrationBean(listener);
    }
}
