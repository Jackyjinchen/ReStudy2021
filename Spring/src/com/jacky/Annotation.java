package com.jacky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "annotation")
public class Annotation {
    @Value(value = "Hello Annotaion!")
    private String sayHi;

    public String getSayHi() {
        return sayHi;
    }

    public void setSayHi(String sayHi) {
        this.sayHi = sayHi;
    }
}
