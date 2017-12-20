package cn.iponkan.controller;


import cn.iponkan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        userService.insertJdbcUser();
        return "success";
    }
}
