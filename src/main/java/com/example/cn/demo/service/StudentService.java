package com.example.cn.demo.service;

import com.example.cn.demo.dao.StudentDao;
import com.example.cn.demo.pojo.Student;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    public StudentDao studentDao;
    @Autowired
    public RabbitTemplate rabbitTemplate;

    public List<Student> selectAll(){
        return studentDao.selectAll();
    }

    public Student select(String id){
        return studentDao.select(id);
    }

    public void sendEmail(){
        String uuid = UUID.randomUUID().toString();
        rabbitTemplate.convertAndSend("fanout_exchange", "", uuid);
    }
}
