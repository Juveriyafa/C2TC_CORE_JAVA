package com.tnsif.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<Integer> stream=Stream.of(10,20,30,40,50,60);

//counting no of elements
System.out.println("The number of elements present in the stream ="+stream.count());

Integer[] values=new Integer[] {10,20,30,40,50,60};
stream=Arrays.stream(values);


//map function is used for filtering and applied on all the elements
System.out.println("Square of" +Arrays.toString(values)+"is as follows:");

stream=stream.map(m->m*m);
stream.forEach(System.out::println);

System.out.println("The first two elements are:");
Arrays.stream(values).limit(2).forEach(System.out::println);

System.out.println("Elements except 4:");
Arrays.stream(values).skip(4).forEach(System.out::println);

System.out.println("Distint element are:");
Arrays.stream(values).distinct().forEach(System.out::println);
 

List<String> words=Arrays.asList("Hello","World");
Stream<String> stream1=words.stream();
List<String> s1=stream1.map(str->str.toUpperCase()).collect(Collectors.toList()); //Collect all upper case letter and collect into a list
System.out.println(s1);


	}
}
