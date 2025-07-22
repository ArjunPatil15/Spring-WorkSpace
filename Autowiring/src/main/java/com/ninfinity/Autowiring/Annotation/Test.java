package com.ninfinity.Autowiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ninfinity/Autowiring/Annotation/config.xml");
		
		Student s1 = context.getBean("std1",Student.class);
		System.out.println(s1);
	}
}
