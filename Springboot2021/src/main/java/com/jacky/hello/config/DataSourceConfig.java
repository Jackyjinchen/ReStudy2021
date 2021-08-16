package com.jacky.hello.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/15
 * @Content: 数据库配置
 */
@Configuration
public class DataSourceConfig {

    // 通过属性绑定来配置相关参数
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        // 加入监控功能
        druidDataSource.setFilters("stat");
        return druidDataSource;
    }


    // 配置监控页面StateView
    @Bean
    public ServletRegistrationBean registrationBean() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        return registrationBean;

    }
}
