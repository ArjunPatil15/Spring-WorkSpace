package com.ninfinity.Autowiring.XML;

public class Course {
	String courseName;
	String duration;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [CourseName=" + courseName + ", duration=" + duration + "]";
	}
	public Course(String courseName, String duration) {
		super();
		courseName = courseName;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
