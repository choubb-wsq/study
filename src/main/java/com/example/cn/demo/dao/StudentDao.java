package com.example.cn.demo.dao;

import com.example.cn.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentDao {

    public List<Student> selectAll();

    public Student select(String id);
}
