package com.springcore.ci;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ci.config.xml");
        Person p=(Person)context.getBean("Person1");
        Certi  c=(Certi)context.getBean("Certi1");
        
        System.out.println(p);
        System.out.println(c);
	}

}
