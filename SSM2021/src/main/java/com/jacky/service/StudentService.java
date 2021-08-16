package com.jacky.service;

import com.jacky.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    //查询所有数据
    List<Student> selectStudent();
    //插入一个Student
    Integer insertStudent(Student student);
}
