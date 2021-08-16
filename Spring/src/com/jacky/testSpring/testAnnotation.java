package com.jacky.testSpring;

import com.jacky.Annotation;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAnnotation {

    @Test
    public void testAno() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Annotation ano = context.getBean("annotation", Annotation.class);
        System.out.println(ano.getSayHi());
    }
}
