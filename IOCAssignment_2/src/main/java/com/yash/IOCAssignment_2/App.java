package com.yash.IOCAssignment_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.IOCAssignment_2.modul.PrintMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
  
   
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
    PrintMessage pmsg=context.getBean("pm",PrintMessage.class);
    System.out.println(pmsg);
    
    }

}