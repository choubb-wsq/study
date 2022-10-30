package com.example.cn.demo.controller;

import com.example.cn.demo.pojo.Student;
import com.example.cn.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    public StudentService studentService;

    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<Student> selectAll(){
        return studentService.selectAll();
    }

    @RequestMapping("/select/{id}")
    @ResponseBody
    public Student select(@PathVariable String id){
        return studentService.select(id);
    }
}
