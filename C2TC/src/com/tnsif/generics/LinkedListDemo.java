package com.tnsif.generics;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new LinkedList<Integer>(); //generic way 
		
		
		l1.add(450);
		l1.add(300);
		l1.add(600);
		
		System.out.println(l1);
		
		l1.addFirst(01);
		l1.addLast(1500);
		
		//sorting
		Collections.sort(l1);
		System.out.println(l1);
		
		

	}

}
