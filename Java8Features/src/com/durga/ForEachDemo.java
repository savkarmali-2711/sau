package com.durga;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachDemo {

public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(0);
		marks.add(15);
		marks.add(5);
		marks.add(20);
		
		System.out.println(marks);

		Consumer<Integer> c=i->{
//			System.out.println("The Square of "+i+" is:"+(i*i));
		};
		marks.stream().forEach(c);
//		marks.stream().forEach(System.out::println);
		
		
		Integer[] i=marks.stream().toArray(Integer[]::new);
// 		Stream.of(i).forEach(System.out::println);
		
		Stream<Integer> s=Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Integer [] a= {10,20,30,40};
		Stream.of(a).forEach(System.out::println);
		
	}


}
