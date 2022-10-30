package com.example.cn.demo.controller;
import com.example.cn.demo.service.PhoneCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    PhoneCode phoneCode;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "HelloWord";
    }

    @RequestMapping(value = "/login")
    public String Login(Model model, String username, String password){
        log.info("用户为："+username+",密码为："+password+";");
        model.addAttribute("msg","登陆成功！");
        return "test";
    }

    @RequestMapping("/getCode")
    public String setCode(Model model){
        String code = phoneCode.setCode();
        log.info("验证码为："+code);
        model.addAttribute("code",code);
        return "forward:/";
    }
}
