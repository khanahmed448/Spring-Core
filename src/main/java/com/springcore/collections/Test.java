package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collection.config.xml");
		
		Emp centre=(Emp)context.getBean("centre");
		System.out.println(centre);
		System.out.println(centre.getName());
		System.out.println(centre.getPhones());
		System.out.println(centre.getAddresses());
		System.out.println(centre.getCourses());
		System.out.println(centre.getProps());

	}

}
