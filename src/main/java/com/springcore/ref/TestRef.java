package com.springcore.ref;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args)
	{
		ApplicationContext Context=new ClassPathXmlApplicationContext("com/springcore/ref/ref.config.xml");
        A temp=(A)Context.getBean("aref");
        B temp1=(B)Context.getBean("bref");
        
        System.out.println(temp.getX());
        System.out.println(temp.getob().getY());
        System.out.println(temp1.getY());
        System.out.println(temp1);
        System.out.println(temp);
	}

}
