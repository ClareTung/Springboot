package cn.iponkan.mapper;

import cn.iponkan.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper
{
    @Select("select * from user where name =#{name}")
    User getName(@Param("name")String name);
}
