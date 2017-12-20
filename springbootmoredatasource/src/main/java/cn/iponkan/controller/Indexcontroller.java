package cn.iponkan.controller;

import cn.iponkan.test01.mapper.User1Mapper;
import cn.iponkan.test02.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Indexcontroller {
    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/add")
    public String add() {
        user1Mapper.addUser("Tung", 22);
        user2Mapper.addUser("Clare", 22);
        return "成功！";
    }
}
