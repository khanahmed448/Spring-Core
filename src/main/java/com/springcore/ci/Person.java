package com.springcore.ci;



public class Person 
{
   private String name;
   private int number;
   private Certi certi;
   
   public Person(String name,int number,Certi certi)
   {
	   this.name=name;
	   this.number=number;
	   this.certi=certi;
   }

   @Override
   public String toString() 
  {

	return this.name+" : "+this.number+" : "+this.certi.address;
  }

  
   
   
}
