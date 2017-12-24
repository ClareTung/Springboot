import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = { "cn.iponkan.controller,cn.iponkan.util,cn.iponkan.service"})
@MapperScan(basePackages = {"cn.iponkan.mapper"})
@EnableCaching//开启缓存
//@EnableScheduling//开启定时任务
@EnableAsync//开启异步操作
@EnableAutoConfiguration
public class SpringBootApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
