package com.tnsif.multithreading;

public class ChildThread extends Thread
{
	//method overriding occurs when a subclass (child class) has the same method as the parent class.
	public void run() //running state
	//The run() method in Java is used to start a new thread. The Java Virtual Machine calls the run() method of this thread. 
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("I am a child Thread!!!");
		}
	
	}
}
