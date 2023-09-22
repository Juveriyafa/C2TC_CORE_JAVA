package com.tnsif.Lambdaandstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//conventional way
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(11);
		l.add(15);
		l.add(26);
		l.add(102);
		l.add(235);
		l.add(118);
		l.add(112);
		l.add(101);
		
		/*System.out.println(1);
		List<Integer> evenList=new ArrayList<>();
		for(Integer i:l)
			
		{
			evenList.add(i);
			
		}
	
	System.out.println(evenList);*/
	
	Stream<Integer> stream=l.stream();
	List<Integer>
even=stream.filter(i->i%2==0).collect(Collectors.toList());	
	
	System.out.println(even);	
		

	}

}
