package com.javarevisited;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<String> alphabets=new ArrayList<String>(Arrays.asList("aa","bbb","cat","fish"));
		
//		alphabets.forEach(s->System.out.println(s+","));	
//		alphabets.forEach(System.out::println);
		
//		alphabets.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
//		alphabets.stream().filter(s -> s.endsWith("g")).forEach(System.out::println);
//		alphabets.stream().filter(s->s.length()>2).forEach(System.out::println);
		
		alphabets.stream().mapToInt(s -> s.length()).forEach(System.out::println);
		
	}
}
