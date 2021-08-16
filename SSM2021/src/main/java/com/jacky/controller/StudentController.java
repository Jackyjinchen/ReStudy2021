package com.jacky.controller;

import com.jacky.entity.Student;
import com.jacky.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public String getStudent(Map<String,Object> map) {
        List<Student> students = studentService.selectStudent();
        System.out.println(students);
        map.put("allStud",students);
        return "list";
    }

}
