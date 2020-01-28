package com.durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collection_Stream_ {

public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		System.out.println(marks);
		
		List<Integer> updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
//		System.out.println(updatedMarks);
		
		long listOfFailedStudent =marks.stream().filter(m->m<35).count();
//		System.out.println(listOfFailedStudent);
		
		List<Integer> sortedList=marks.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedList);                //Natural sorting order
		
		List<Integer> sortedList2=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
//		System.out.println(sortedList2);               //Customized  sorting order
		
		List<Integer> a=marks.stream().sorted((i1,i2)->(-i1.compareTo(i2))).collect(Collectors.toList());
//		System.out.println(a);                         //reverse of natural sorting order 
		
		List<Integer> b=marks.stream().sorted((i1,i2)->(i2.compareTo(i1))).collect(Collectors.toList());
//		System.out.println(b);                         //reverse of natural sorting order 
		
		Integer min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println(min);
		
		Integer max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		
	}
}
