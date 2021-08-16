package com.jacky.hello.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/14
 * @Content: 定义@ControllerAdvice处理web controller异常
 */
@ControllerAdvice
public class GlobalExceptionHander {

    // 异常处理器
    @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
    public String handleArithException() {
        System.out.println("算数异常");
        return "success";
    }
}
