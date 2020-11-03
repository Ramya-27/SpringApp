package com.jfs.spring.SpringAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Hello h=context.getBean("hello",Hello.class);
       h.show();
       
    }
}
