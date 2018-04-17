package smm.springboot_ftl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import smm.springboot_ftl.action.UserController;

@SpringBootApplication 
@EnableAutoConfiguration 
public class Application {
	
	public static void main(String[] args){
		SpringApplication.run(Application.class,args);
	}
}
