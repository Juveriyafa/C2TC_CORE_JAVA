package com.tnsif.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s=new String("Juveriya"); //1 way of object is created in heap area
		
		
		
		
		//s.concat("Tiwari");
		// the object doesn't  change as they are immutable in nature
		s=s.concat("Farooqui");//s is pointing to the string
		System.out.println(s);
		

	}

}
