package com.springcore.lifecyle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation 
{
   private String subject;

/**
 * @return the subject
 */
public String getSubject() {
	return subject;
}

/**
 * @param subject the subject to set
 */
public void setSubject(String subject) {
	this.subject = subject;
}

public Annotation() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Annotation [subject=" + subject + "]";
}
   
   @PostConstruct
   public void start()
   {
	   System.out.println("init method");
   }
   
   @PreDestroy
   public void end()
   {
	   System.out.println("destroy method");
   }
}
