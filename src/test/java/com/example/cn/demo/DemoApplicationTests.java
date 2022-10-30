package com.example.cn.demo;

import com.example.cn.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.rmi.runtime.Log;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    @Autowired
    public StudentService studentService;

    @Test
    void contextLoads() {
        studentService.sendEmail();
        System.out.println("成功！");
    }

}
