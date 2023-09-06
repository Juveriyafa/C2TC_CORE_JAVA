package com.tnsif.exceptionhandling;
import java.util.*;
//Demo on multiple catch block
public class Division {
public static void divide()
	{
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers ");
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			
			System.out.println("Result is ="+c);
		}
		catch(InputMismatchException e) //specific child class first for multiple exceptions
		{
			System.out.println("Invalid input.PLease enter integers only");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught"+e.getMessage());
			
		}
		catch (Exception e)
		{
			System.out.println("exception caught..."+e.getMessage());
		}
		finally
		{
			System.out.println("I will execute however");
			
		}
	}

}