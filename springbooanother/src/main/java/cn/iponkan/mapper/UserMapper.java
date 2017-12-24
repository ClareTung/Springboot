package cn.iponkan.mapper;

import cn.iponkan.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "baseCache")
public interface UserMapper
{
    @Select("select * from user where name =#{name}")
    @Cacheable
    User getName(@Param("name")String name);
}
