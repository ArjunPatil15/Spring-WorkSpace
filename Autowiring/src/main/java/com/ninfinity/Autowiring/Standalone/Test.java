package com.ninfinity.Autowiring.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ninfinity/Autowiring/Standalone/config.xml");
		
//		Person p1 = context.getBean("per1",Person.class);
//		System.out.println(p1);
//		
//		System.out.println("-------------------------------------");
//		
//		Teacher t1 = context.getBean("ter1",Teacher.class);
//		System.out.println(t1);
//		System.out.println("-------------------------------------");
		
		
//		Student s1 = context.getBean("std1",Student.class);
//		System.out.println(s1);
//		System.out.println("-------------------------------------");
		
		
		Student s2 = (Student)context.getBean("student");
		System.out.println(s2);
		System.out.println("-------------------------------------");
		
		
	}
}
