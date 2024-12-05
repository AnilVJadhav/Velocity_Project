package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//Creating Object Of ApplicationContext
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
        //Calling getBean Method
		Student student=(Student) applicationContext.getBean("a");
		System.out.println("Student Object is :"+student);
	}
}
