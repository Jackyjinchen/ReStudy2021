package com.jacky.hello.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/15
 * @Content:
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner.run");
    }
}
