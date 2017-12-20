package cn.iponkan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap map){
        map.put("name","张三");
        map.put("sex",1);
        List<String> userList=new ArrayList<String>();
        userList.add("Doo");
        userList.add("Tan");
        userList.add("Qiang");
        map.addAttribute("userList",userList);
        return "index";
    }
}
