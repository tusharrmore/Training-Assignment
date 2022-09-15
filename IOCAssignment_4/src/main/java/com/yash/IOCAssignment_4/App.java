package com.yash.IOCAssignment_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.IOCAssignment_4_modul.ConstructorMessage;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome to Spring IOC 4th Assignment");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		ConstructorMessage cmsg=(ConstructorMessage) context.getBean("cm");
		System.out.println(cmsg);
    }
}
