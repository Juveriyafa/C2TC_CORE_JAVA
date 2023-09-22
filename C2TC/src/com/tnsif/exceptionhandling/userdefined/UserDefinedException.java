package com.tnsif.exceptionhandling.userdefined;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age");
		
		// Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age<18)
		{ //pass the object of exception class to JVM
			throw new CantVoteException("You are not eligible to vote");
			
		}
		else
		{
			System.out.println("You are eligible to vote");
			
		}

	}
}
//Create a custom exception class named CantVoteException
//the custom exception class must be extending to a in built class
	class CantVoteException extends RuntimeException
	{
		CantVoteException(String msg)
		{
			 // Call the constructor of the superclass (RuntimeException) with a custom message
			super(msg);
		}

		
			
		}
	




