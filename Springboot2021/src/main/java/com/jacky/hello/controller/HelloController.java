package com.jacky.hello.controller;

import com.jacky.hello.bean.Car;
import com.jacky.hello.bean.Pet;
import com.jacky.hello.exception.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

//@RestController
@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    Car car;

    @DeleteMapping("/car")
    public Car car() {
        return car;
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String handle01(@RequestParam(value = "name", required = false) String name) {
        return "Hello, SpringBoot!" + name;
    }

    @ResponseBody
    @RequestMapping("/hi")
    public String handle02() {
        return "Hello, SpringBoot!";
    }


    // 可以设置头部来获取自定义类型converter application/my-pet
    @ResponseBody
    @RequestMapping("/pet")
    public Pet handle03() {
        Pet pet = new Pet();
        pet.setName("dog!");
        return pet;
    }


    // 自定义类型的处理解析方式
    // /car?name=autocar&brand=byd
    @ResponseBody
    @RequestMapping("/car")
    public Car handle02(Car car) {
        return car;
    }

    // 需要用@Controller @RestController包含@ResponseBody导致转发失效
    @RequestMapping("/mav")
    public String handle03(Map<String, Object> map,
                        Model model,
                        HttpServletRequest request,
                        HttpServletResponse response) {
        map.put("hello", "world");
        model.addAttribute("ModelKey","ModelValue");
        request.setAttribute("req","resO");
        Cookie cookie = new Cookie("cookieK","cookieV");
        response.addCookie(cookie);
        cookie.setDomain("localhost");
        return "forward:/hi";
    }

    // 请求/matrix/sell;low=34;brand=byd,audi,yd
    @RequestMapping("/matrix/{path}")
    public Map handlematrix(@MatrixVariable("low") Integer low,
                            @MatrixVariable("brand") List<String> brand,
                            @PathVariable("path") String path) {
        Map<String, Object> map = new HashMap<>();
        map.put("low", low);
        map.put("brand", brand);
        map.put("path", path);
        return map;
    }

    // go MVC Return
    @GetMapping("/success")
    public String thymeleaf(Model model) {
        return "redirect:/thymeleaf";
    }

    // Thymeleaf
    @GetMapping("/thymeleaf")
    public String thymeleafTest(Model model) {
        model.addAttribute("msg","Hello Thymeleaf");
        model.addAttribute("url","http://www.bilibili.com");
        model.addAttribute("urlname","Bilibili");
        return "success";
    }

    // 文件上传
    /**
     * MultipartFile 自动封装上传过来的文件
     * @param headerImg
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestPart("headerImg") MultipartFile headerImg
//                         @RequestPart("photos") MultipartFile[] photos
    ) throws IOException {

        if(!headerImg.isEmpty()){
            //保存到文件服务器，OSS服务器
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("/Users/jindoc/Desktop/"+originalFilename));
        }

//        if(photos.length > 0){
//            for (MultipartFile photo : photos) {
//                if(!photo.isEmpty()){
//                    String originalFilename = photo.getOriginalFilename();
//                    photo.transferTo(new File("/Users/jindoc/Desktop/"+originalFilename));
//                }
//            }
//        }


        return "redirect:/hi";
    }

    // 5xx error
    @GetMapping("/5xx")
    public String testError(Model model) {
        int i = 1;
        i = i/0;
        return "success";
    }

    // 自定义一个ResponseStatus异常
    @GetMapping("/responseStatusError")
    public String testError1() {
        if(true) {
            throw new ResponseStatusException("日了狗了的异常responseStatusException");
        }
        return "success";
    }

    @ResponseBody
    @GetMapping("/sql")
    public String sqlTest() {
        int count = jdbcTemplate.queryForObject("select count(*) from book",Integer.class);
        return String.valueOf(count);
    }

}
