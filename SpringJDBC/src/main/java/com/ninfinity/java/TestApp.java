package com.ninfinity.java;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ninfinity.dao.StudentDaoImpl;
import com.ninfinity.entities.Student;

/**
 * Hello world!
 *
 */
public class TestApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        StudentDaoImpl studentDaoImpl = context.getBean(StudentDaoImpl.class);
        
        Student s1 = new Student();
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        
       System.out.print("\n-----------------Menu-------------------\n\n********  Using Java Annotation  ********\n1.Insert Data\n2.Update Data\n3.Delete Data\n4.Show One record\n5.Show all records\n\n****************************************\nSelect one option : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
        int result;
        switch(n) {
        
        case 1:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
        	scanner.nextLine();
        	System.out.print("Enter FirstName: ");
        	s1.setFirstname(scanner.nextLine());
        	System.out.print("Enter LastName: ");
        	s1.setLastname(scanner.nextLine());
        	System.out.print("Enter City: ");
        	s1.setCity(scanner.nextLine());
        	
        	result = studentDaoImpl.insert(s1);
        	
        	if(result==1) {
        		System.out.println("Your Record Has Inserted Successfully");
        	}else {
        		System.out.println("The Record Not Inserted Error Occurred");
        	}
        	break;
        	
        case 2:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
        	scanner.nextLine();
        	System.out.print("Enter FirstName: ");
        	s1.setFirstname(scanner.nextLine());
        	System.out.print("Enter LastName: ");
        	s1.setLastname(scanner.nextLine());
        	System.out.print("Enter City: ");
        	s1.setCity(scanner.nextLine());
        	
        	result = studentDaoImpl.updateRecord(s1);
        	
        	if(result==1) {
        		System.out.println("Your Record Has Updated Successfully");
        	}else {
        		System.out.println("The Record Not Updated Error Occurred");
        	}
        	break;
        	
        case 3:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
        	
        	
        	result = studentDaoImpl.delete(s1.getId());
        	
        	if(result==1) {
        		System.out.println("Your Record Has Deleted Successfully");
        	}else {
        		System.out.println("The Record Not Deleted Error Occurred");
        	}
        	break;
        	
        case 4:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
  
        	
        	Student s2 = studentDaoImpl.getOneStudent(s1.getId());
        	
        	if(s2.equals(null)) {
        		System.out.println("No Object Present With This ID");
        	}else {
        		System.out.println(s2);
        	}
        	break;
        	
        case 5:
        	List<Student> sList = studentDaoImpl.getAllStudent();
        	
        	if(sList.isEmpty()) {
        		System.out.println("No Object Present With This ID");
        	}else {
        		for(Student s: sList ) {
        			System.out.println(s+" ");
        		}
        	}
        	break;
        	
        default:
        	System.out.println("Please Enter The Valid Choice");
        	break;
        
        }
        
        }
        
    }
}
