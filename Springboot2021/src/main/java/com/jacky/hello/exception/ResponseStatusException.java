package com.jacky.hello.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/14
 * @Content: 可在处理Controller中抛出异常来处理
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "异常的原因")
public class ResponseStatusException extends RuntimeException {
    public ResponseStatusException() {
    }

    public ResponseStatusException(String message) {
        super(message);
    }
}
