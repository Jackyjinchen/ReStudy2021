package com.jacky.dao;

import com.jacky.entity.Student;

import java.util.List;

public interface StudentDao {

    //查询所有数据
    List<Student> selectStudentAll();
    //插入一个Student
    Integer insertStudentById(Student student);

}
