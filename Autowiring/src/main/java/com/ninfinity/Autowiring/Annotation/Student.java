package com.ninfinity.Autowiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("crc2")
	Course crc;

	public Course getCrc() {
		return crc;
	}
	
	//use SI
	//@Autowired
	public void setCrc(Course crc) {
		System.out.println("DI using SI");
		this.crc = crc;
	}

	@Override
	public String toString() {
		return "Student [crc=" + crc + "]";
	}

	public Student(Course crc) {
		super();
		System.out.println("DI using CI");
		this.crc = crc;
	}
	
	//use CI
	//@Autowired
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
