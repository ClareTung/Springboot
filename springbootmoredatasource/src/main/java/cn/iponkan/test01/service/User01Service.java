
package cn.iponkan.test01.service;

import cn.iponkan.test01.mapper.User1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User01Service {
	@Autowired
	private User1Mapper user1Mapper;

	public int addUser(String name, Integer age) {
		return user1Mapper.addUser(name, age);
	}

}
