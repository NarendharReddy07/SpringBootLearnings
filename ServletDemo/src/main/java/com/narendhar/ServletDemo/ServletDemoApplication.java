package com.narendhar.ServletDemo;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServletDemoApplication {

	public static void main(String[] args) throws LifecycleException {

		//SpringApplication.run(ServletDemoApplication.class, args);
		System.out.println("hello world");

		Tomcat tomcat=new Tomcat();

		Context context=tomcat.addContext("",null);
		Tomcat.addServlet(context,"helloServlet",new HelloServlet());
		context.addServletMappingDecoded("/hello","helloServlet");


		tomcat.start();
		tomcat.getServer().await();
	}

}
