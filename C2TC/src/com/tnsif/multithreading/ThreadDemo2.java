package com.tnsif.multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an instance of the ChildThreadDemo class
		ChildThreadDemo t=new ChildThreadDemo();
		
		
		// Create a new Thread, passing the ChildThreadDemo instance as the target so that we can start the thread
		Thread d=new Thread(t);
		
		d.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am a  Main thread!!!");
		}

	}

}
