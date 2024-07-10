package com.narendhar.JdbcDemoProject;

import com.narendhar.JdbcDemoProject.model.Student;
import com.narendhar.JdbcDemoProject.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcDemoProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JdbcDemoProjectApplication.class, args);

		Student s=context.getBean(Student.class);
		s.setAge(15);
		s.setName("narendhar");

		System.out.println(s.toString());

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		System.out.println(service.getStudents());
	}

}
