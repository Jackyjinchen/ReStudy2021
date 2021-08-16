package com.jacky.hello.config;

import com.jacky.hello.bean.Pet;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/13
 * @Content:
 */
public class MyConverter implements HttpMessageConverter<Pet> {
    @Override
    public boolean canRead(Class<?> aClass, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canWrite(Class<?> aClass, MediaType mediaType) {
        return aClass.isAssignableFrom(Pet.class);
    }

    /**
     * 支持的内容类型
     * @return MediaType List
     */
    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return MediaType.parseMediaTypes("application/my-pet");
    }

    @Override
    public Pet read(Class<? extends Pet> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(Pet pet, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        // 自定义写出
        String data = pet.getName()+"取得了，用的my-pet Converter";
        OutputStream body = httpOutputMessage.getBody();
        body.write(data.getBytes(StandardCharsets.UTF_8));

    }

}
