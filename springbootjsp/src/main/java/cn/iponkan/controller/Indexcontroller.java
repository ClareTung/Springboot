package cn.iponkan.controller;

import cn.iponkan.entity.User;
import cn.iponkan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Indexcontroller {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/getName")
    public User getName(String name){
        return userMapper.getName(name);
    }
}
