
package com.springcore.lifecyle;

import java.lang.module.Configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
      public static void main(String[] args)
     {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecyle/Config.xml");
		//Tea tea=(Tea)context.getBean("pot");
		
		//System.out.println(tea);
		
 //-------------------------------------------------------------------------
		
		context.registerShutdownHook();//registerShutdownHook() it is a method of AbstractApplicationContext
		
//--------------------------------------------------------------------------
		//System.out.println("+++++++++++++++++++++++++++++++++++");
		
		//Pepsi p=(Pepsi)context.getBean("p1");
		//System.out.println(p);
		
//--------------------------------------------------------------------------		
		   Annotation an=(Annotation)context.getBean("an");
		   System.out.println(an);
		   
	 }
}
