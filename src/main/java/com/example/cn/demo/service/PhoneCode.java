package com.example.cn.demo.service;

import org.junit.Test;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PhoneCode {

    public String setCode(){
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            //生成10以内的随机整数
            int rad = random.nextInt(10);
            //拼接为6为随机整数
            code += rad;
        }
        return code;
    }

    public void getCode(String phone){

    }
}
