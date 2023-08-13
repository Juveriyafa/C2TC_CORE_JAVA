package com.tnsif.dayone;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit typecasting or widening
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.5f;
		double d=f;
		System.out.println(d);
		
		char ch= 'A';
		int i2=ch;
		System.out.println(i2);
		
		char varl='\u00A7';
		int i3=varl;
		System.out.println(i3);
		
		//Explicit Typecasting or narrowing
		double f1=10.3f;
		int i5=(int)f1;
		System.out.println(i5);
		
		float f2=34.56f;
		int i1=(int)f2;
		System.out.println(i1); 
		
		
		
	}
}
		
		
		
		

	