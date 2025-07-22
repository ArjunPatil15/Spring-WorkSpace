package com.ninfinity.Autowiring.Standalone;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("std1")
@Component
public class Student {
	@Value("Arjun")
	String studentName;
	
	@Value("7")
	int rollNumber;
	
	@Value("#{myfriends}")
	List<String> friend;
	
	@Value("#{mymarks}")
	Map<String , Integer> marks;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", friend=" + friend + ", marks="
				+ marks + "]";
	}

	public Student(String studentName, int rollNumber, List<String> friend, Map<String, Integer> marks) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.friend = friend;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
