package com.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread();  //new state
		c.start(); //Runnable state
		for(int i=0;i<10;i++)
		{
			System.out.println("I am a  Main thread!!!");
		}

	}

}
