package com.jacky.service.serviceImpl;

import com.jacky.entity.Student;
import com.jacky.dao.StudentDao;
import com.jacky.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> selectStudent() {
        return studentDao.selectStudentAll();
    }

    @Override
    public Integer insertStudent(Student student) {
        return studentDao.insertStudentById(student);
    }
}
