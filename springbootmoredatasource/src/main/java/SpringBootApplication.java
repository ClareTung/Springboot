import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "cn.iponkan.controller","cn.iponkan.datasource","cn.iponkan.test01","cn.iponkan.test02"})
@EnableAutoConfiguration
public class SpringBootApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
