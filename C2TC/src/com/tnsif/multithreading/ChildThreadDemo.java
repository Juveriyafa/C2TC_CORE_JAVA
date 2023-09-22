package com.tnsif.multithreading;
//invoking thread using runnable interface

public class ChildThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1;i<5;i++) {
			
			System.out.println(i);
		}
		
	}

}
