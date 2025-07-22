package com.ninfinity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String configPath = "com/ninfinity/config.xml";
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configPath);
        
        context.registerShutdownHook();
        
//        XML
//        Car c1 = context.getBean("Car1",Car.class);
//        System.out.println(c1);
        
//        Interface
//        Computer c1 = context.getBean("comp1",Computer.class);
//        System.out.println(c1);

//      Annotation
        Mobile m1 = context.getBean("mob1",Mobile.class);
        System.out.println(m1);
        
    }
}
