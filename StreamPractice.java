package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(21);
		list.add(39);
		list.add(71);
		list.add(11);
		list.add(34);
		list.add(90);
		list.add(23);
		list.add(54);
		list.add(76);
		list.add(21);
		
		System.out.println(list);
		
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list1);
		
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list2);
		
		list = list2;
		
		List<Integer> list3 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list3);
		
		List<Integer> ger = list.stream().map((a) ->{
			if(a>20) {
				return a;
			} else {
				return (a+20); 
			}			
		}).collect(Collectors.toList());
		
		System.out.println(ger); 
		
		
		
	}
}
