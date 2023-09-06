package com.tnsif.exceptionhandling.userdefined;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age");
		
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
	class CantVoteException extends RuntimeException
	{
		CantVoteException(String msg)
		{
			
			super(msg);
		}

		
			
		}
	




