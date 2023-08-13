package com.tnsif.daythree;

 class Student {
	String name;
	int age;
	int roll_no;
	
}
 class Sample
{
	public static void main(String[] args)
	{
		Student s1=new Student(); //accessing the members of the class by creating object
		s1.name="Afra Farooqui";
		s1.age=13;
		s1.roll_no=25;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.roll_no);
	}
}
