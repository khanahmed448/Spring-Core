package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone.config.xml");
        Person p=context.getBean("Person",Person.class);
        
        System.out.println(p);
        System.out.println(p.getFriend());
        System.out.println(p.getFriend().getClass().getName());
        System.out.println("----------------------------------------------");
        System.out.println(p);
        System.out.println(p.getFeestructure());
        System.out.println(p.getFeestructure().getClass().getName());
        System.out.println("----------------------------------------------");
        System.out.println(p);
        System.out.println(p.getProperties());
        System.out.println(p.getProperties().getClass().getName());
	}

}
