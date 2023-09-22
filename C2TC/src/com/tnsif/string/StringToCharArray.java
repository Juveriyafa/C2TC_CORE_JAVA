package com.tnsif.string;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// String to character array
		
		String str="I am a student";
		char ch[]=str.toCharArray();

        System.out.println("String to Character Array:");
		System.out.println(Arrays.toString(ch));
		
		//char array to string
		char ch1[]= {'J','u','v','e','r','i','y','a'};
		String s=new String(ch1);
		 System.out.println("Character Array to String:");
		System.out.println(s);
	}

}
