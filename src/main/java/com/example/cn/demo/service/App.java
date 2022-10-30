package com.example.cn.demo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.UUID;

@Data
@Accessors(chain = true)
public class App {

    public String uuid;
    public String kind;

    public String getUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }
    

}
