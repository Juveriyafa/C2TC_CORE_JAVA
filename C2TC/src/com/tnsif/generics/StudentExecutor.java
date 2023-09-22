package com.tnsif.generics;

import java.util.ArrayList;
import java.util.Collections;

public class StudentExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList= new ArrayList<Student>();
		Student s1=new Student(25,"Afra",95);
		
		studentList.add(s1);
		
		Student s2=new Student(26,"Shifa",80);
		studentList.add(s2);
		Student s3=new Student(10,"Adeeb",100);
		studentList.add(s3);
		Student s4=new Student(27,"Namira",50);
		studentList.add(s4);
		
		System.out.println(studentList);
		Collections.sort(studentList);
	}
	

}
