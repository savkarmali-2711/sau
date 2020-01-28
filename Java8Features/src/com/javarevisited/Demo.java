package com.javarevisited;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<String> cards=Arrays.asList("Visa","Master Card","American Express","Visa");
		System.out.println("list: "+cards);
		
		Map<String, Integer> cards2length = cards.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)->e1));
           System.out.println("map: "+cards2length);
	}
}
