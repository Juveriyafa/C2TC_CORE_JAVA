
package com.tnsif.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="SANKIRTHANA"; //object is created in string constant pool area
		
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.length());
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,10));
		System.out.println(str.equals("Juveriya")); //for String comparison
		System.out.println(str.equalsIgnoreCase("sankirthana"));
		

	}

}
