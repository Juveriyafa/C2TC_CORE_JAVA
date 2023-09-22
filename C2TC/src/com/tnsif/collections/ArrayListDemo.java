package com.tnsif.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1=new ArrayList(); //No type Safety
		a1.add("A");
		a1.add(10);
		a1.add(null);
		a1.add(53);
		
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		
		a1.add(2,"M");
		System.out.println(a1);

	}

}
