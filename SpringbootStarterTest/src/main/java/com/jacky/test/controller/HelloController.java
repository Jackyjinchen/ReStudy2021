package com.jacky.test.controller;

import com.jacky.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/30
 * @Content:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello() {
        return helloService.sayHello("Jackyjin");
    }

}
