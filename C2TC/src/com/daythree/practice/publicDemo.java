package com.daythree.practice;

import java.util.Scanner;

public class publicDemo {

	public static void main(String[] args) {
		 Scanner ob=new Scanner (System.in);
		 
		 System.out.println("Enter name");
		 String name=ob.next();
		 
		 System.out.println("Enter age");
		 int age=ob.nextInt();
		 
		 System.out.println("Enter salary");
		 int salary=ob.nextInt();

		 
		 Person p=new Person();
		 p.setName(name);
		 p.setAge(age);
		 p.setSalary(salary);
		 
		 System.out.println(p);
		 // TODO Auto-generated method stub

	}

}
