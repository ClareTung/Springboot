package cn.iponkan.controller;

import cn.iponkan.entity.User;
import cn.iponkan.mapper.UserMapper;
import cn.iponkan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.config.CacheManagementConfigUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Indexcontroller {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CacheManager cacheManager;
    @Autowired
    private UserService userService;

    @Value("${name}")
    private String name;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("getValue")
    public  String getValue(){return name;}

    @ResponseBody
    @RequestMapping("/getName")
    public User getName(String name){
        return userMapper.getName(name);
    }

    //清除缓存
    @ResponseBody
    @RequestMapping("/removeCache")
    public  String removeCache(){
        cacheManager.getCache("baseCache").clear();
        return "success";
    }

    @ResponseBody
    @RequestMapping("/sedSms")
    public String sedSms() {
        System.out.println("###indexController### 1");
        userService.sedSms();
        System.out.println("###indexController### 4");
        return "success";
    }
}
