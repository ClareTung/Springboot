package cn.iponkan.controller;

import cn.iponkan.entity.User;
import cn.iponkan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/index")
    public String index(Integer id){
       User u= userRepository.findOne(id);
       return u.toString();
    }
}
