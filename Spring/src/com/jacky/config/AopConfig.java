package com.jacky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/16
 * @Content:
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.jacky"})
public class AopConfig {
}
