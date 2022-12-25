package com.example.springcore;

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

    	AbstractApplicationContext applicationContext=
    			new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    
    	Student  student = applicationContext.getBean("student",Student.class);

    	System.out.println(student);
    
    }
    
}
