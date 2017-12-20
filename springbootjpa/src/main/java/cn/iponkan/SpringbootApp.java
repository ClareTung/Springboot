package cn.iponkan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "cn.iponkan.controller" })
@EnableJpaRepositories(basePackages = {"cn.iponkan.repository"})
@EntityScan(basePackages = {"cn.iponkan.entity"})
@EnableAutoConfiguration
public class SpringbootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class,args);
    }
}
