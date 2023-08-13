package com.tnsif.daythree;

import java.util.Scanner; //import scanner class to use scanner method

public class PersonDemo {
	public static void main(String[] args)
	{
	Scanner ob=new Scanner(System.in);// to take input from class
	System.out.println("Enter the name of the person=");
	String name=ob.next();//next is scanner class object to read string input from user
	
	System.out.println("Enter the age of the person=");
	int age=ob.nextInt();
	
	System.out.println("Enter the gender of the person=");
	String gender=ob.next();
	
	System.out.println("Enter the income of the person=");
	int income=ob.nextInt();
	
	Person person=new Person(); //the code creates a Person object, sets its name, age, gender, and income properties based on the provided values.
	person.setName(name);
	person.setAge(age);
	person.setGender(gender);
	person.setIncome(income);
	
	System.out.println(person);
	
	TaxCalculation calc=new TaxCalculation();
	calc.calculateTax(person);
	
	System.out.println("After Tax calculation");
	System.out.println(person);

}
}
