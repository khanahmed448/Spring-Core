package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
     public static void main(String[] args)
    {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config.xml");
		Student Std=context.getBean(Student.class);
		Student Std2=(Student)context.getBean("student2");
		Student Std3=(Student)context.getBean("student3");
		
		System.out.println(Std);
		System.out.println(Std2);
		System.out.println(Std3);
	}
}
