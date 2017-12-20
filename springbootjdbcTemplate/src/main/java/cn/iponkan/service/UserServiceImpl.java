package cn.iponkan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertJdbcUser() {
        jdbcTemplate.update("insert into user values(null,?,?);","lisi",19);
    }
}
