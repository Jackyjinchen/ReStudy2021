package com.jacky.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UserDaoProxy implements InvocationHandler {
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法执行前,参数" + Arrays.toString(args));
        Object res = method.invoke(obj, args);
        System.out.println("方法执行后+10:" + obj);
        return (int) res + 10;
    }
}
