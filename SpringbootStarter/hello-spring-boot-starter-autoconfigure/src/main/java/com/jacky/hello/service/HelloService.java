package com.jacky.hello.service;

import com.jacky.hello.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/30
 * @Content: 默认不要放在容器中
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName) {
        return helloProperties.getPrefix() + ": " + userName + "," + helloProperties.getSuffix();
    }
}
