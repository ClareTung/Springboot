
package cn.iponkan.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;


@CacheConfig(cacheNames = "baseCache")
public interface User1Mapper {

	@Insert("insert into user values(null,#{name},#{age});")
	public int addUser(@Param("name") String name, @Param("age") Integer age);
}
