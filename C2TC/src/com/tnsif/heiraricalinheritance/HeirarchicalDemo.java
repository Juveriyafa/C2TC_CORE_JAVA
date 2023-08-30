package com.tnsif.heiraricalinheritance;

public class HeirarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p;
   p=new Person("Dhruv","Mumbai");
   
   /*The java instanceof operator is used to test 
   whether the object is an instance of the specified type (class or subclass or interface).*/
   
  if (p instanceof Person)
	  System.out.println("Person Details="+p);
  
  
  
  p=new Employee("Nikhil", "Mumbai",101,7000,"Sales");
  
  if (p instanceof Person)
  System.out.println("Employee Detail="+p);
  
  
p=new Student("Nikhil", "Mumbai","b.tech",59);
  
  if (p instanceof Person)
  System.out.println("Student Detail="+p);

	}
	
	

}