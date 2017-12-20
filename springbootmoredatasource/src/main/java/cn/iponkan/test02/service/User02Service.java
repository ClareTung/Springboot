
package cn.iponkan.test02.service;

import cn.iponkan.test02.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class User02Service {
    @Autowired
	private User2Mapper user2Mapper;
	
	public int addUser(String name,Integer age){
		return user2Mapper.addUser(name, age);
	}

}
