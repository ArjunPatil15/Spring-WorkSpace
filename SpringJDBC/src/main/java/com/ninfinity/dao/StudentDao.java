package com.ninfinity.dao;

import java.util.List;

import com.ninfinity.entities.Student;

public interface StudentDao {
	
	public int insert(Student s1);
	
	public int delete(int id);
	
	public int updateRecord(Student s1);
	
	public Student getOneStudent(int id);
	
	List<Student> getAllStudent();
	
}
