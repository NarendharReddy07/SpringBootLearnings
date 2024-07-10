package com.narendhar.AnnotationsInSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationsInSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(AnnotationsInSpringBootApplication.class, args);//initilaizes containter
		Employe obj=context.getBean(Employe.class);
		obj.compute();
	}

}
