package com.narendhar.JdbcDemo;

import com.narendhar.JdbcDemo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(JdbcDemoApplication.class, args);
		Student s=context.getBean(Student.class);
		s.setAge(15);
		s.setName("narendhar");

		System.out.println(s.toString());
	}

}
