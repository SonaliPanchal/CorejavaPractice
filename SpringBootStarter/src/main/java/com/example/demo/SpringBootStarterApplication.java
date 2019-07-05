package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.controller")
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		
		/*ApplicationContext ctx =  */SpringApplication.run(SpringBootStarterApplication.class, args);
		
		/*String [] beans = ctx.getBeanDefinitionNames();
		
		Arrays.sort(beans);
		
		for(String beanname : beans)
		{
			System.out.println("beanname------->"+beanname);
		}*/
	}

}
