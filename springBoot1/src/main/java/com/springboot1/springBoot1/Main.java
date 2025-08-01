package com.springboot1.springBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Main.class, args);

		Programmer p1 = context.getBean(Programmer.class);
	   p1.code();

	}

}
