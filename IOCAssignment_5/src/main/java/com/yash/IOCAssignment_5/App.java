package com.yash.IOCAssignment_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.IOCAssignment_5.modul.SetterMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        SetterMessage smsg=context.getBean("sm",SetterMessage.class);
        System.out.println(smsg);
    }
}
