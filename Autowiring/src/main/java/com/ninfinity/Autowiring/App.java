package com.ninfinity.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ninfinity.Autowiring.XML.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {      
        String configPath = "com/ninfinity/Autowiring/XML/config.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
        
        Student s1  = context.getBean("std1",Student.class);
        System.out.println(s1);
    }
}
