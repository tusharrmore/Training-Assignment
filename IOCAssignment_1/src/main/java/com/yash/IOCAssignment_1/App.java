package com.yash.IOCAssignment_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.IOCAssignment_1.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
    	System.out.println("Welcome to Spring IOC first Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e=(Employee) context.getBean("em");
		System.out.println(e);
    }
}