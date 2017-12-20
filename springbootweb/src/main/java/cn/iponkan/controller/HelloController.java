package cn.iponkan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/test1")
    public String  testGlobalException(){
        int i = 1/0;
        return "success";
    }

}
