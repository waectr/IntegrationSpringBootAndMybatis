package com.waectr.springbootmybatis.controller;

import com.waectr.springbootmybatis.bean.Student;
import com.waectr.springbootmybatis.bean.Teacher;
import com.waectr.springbootmybatis.mapper.StudentMapper;
import com.waectr.springbootmybatis.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/stu/{id}")
    public Student getStu(@PathVariable("id") Integer id){
        Student stu = studentMapper.getStuById(id);
        return stu;
    }

    @GetMapping("/stu")
    public Student insertStu(Student student){
        int i = studentMapper.insertStu(student);
        return student;
    }

    @Autowired
    TeacherMapper teacherMapper;

    @GetMapping("/tec/{id}")
    public Teacher getTeacherById(@PathVariable("id") Integer id){
        return teacherMapper.getTeacherById(id);
    }
}
