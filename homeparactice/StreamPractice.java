package com.homeparactice;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	String processor,gpu;
	int ram,rom;
	StreamPractice (String processor,String gpu,int ram,int rom)
	{
		this.processor=processor;
		this.gpu=gpu;
		this.ram=ram;
		this.rom=rom;
	}
	
	public static void main(String[] args) {
		
		List<StreamPractice> list = new ArrayList<StreamPractice>();
		
		list.add(new StreamPractice("ARM processor","ARM GPU",8,100));
		list.add(new StreamPractice("Intel processor","ARM GPU",16,1500));
		list.add(new StreamPractice("IBM processor","ARM GPU",32,500));
		list.add(new StreamPractice("Strong ARM processor","ARM GPU",4,2000));
		list.add(new StreamPractice("MIPS processor","ARM GPU",16,750));
		list.add(new StreamPractice("Dura processor","ARM GPU",32,2500));
		list.add(new StreamPractice("Multi processor","ARM GPU",4,250));
		
		List<Integer> list1 = list.stream().map((r)->(r.ram)).collect(Collectors.toList());
		
		System.out.println("first"+list1);
		int list2 = list.stream().collect(Collectors.summingInt(StreamPractice->StreamPractice.rom));

		System.out.println(list2);
		
	       double totalPrice3 = list.stream()
	    		   .collect(Collectors.summingDouble
	    				   (StreamPractice->
	    				   		StreamPractice.rom));
	       
	       
	       System.out.println(totalPrice3);
	       
	       list.stream()  
           .filter(StreamPractice -> StreamPractice.ram == 16)  
           .forEach(StreamPractice -> System.out.println(StreamPractice.rom));  
	}
}
