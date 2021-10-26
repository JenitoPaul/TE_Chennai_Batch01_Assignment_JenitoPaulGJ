package com.homeparactice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

public class StringReverse {

	public static void main(String[] args) {
		
			int arr[] = {2,1,5,3,0,7};
			
			int temp =0;
			
			/*
			 * //for (int i = 0,int j = i+1; i < arr.length,j < arr.length; i++,j++) { //for
			 * (int j = i+1; j < arr.length; j++) { if(arr[i]<arr[j]) { temp =arr[i];
			 * arr[i]=arr[j]; arr[j]=temp;
			 * 
			 * //} }
			 */
				//System.out.println(arr[i]);
			//}
		
						
			  String str = "jenito";
			  
			  for(int i=str.length()-1;i>=0;i--){
			  
			  System.out.print(str.charAt(i)); }
			  
			  System.out.println(str);
			  
			  
			  List<Integer> ref = new LinkedList<Integer>(); ref.add(735);
			  
			  List<Character> ref1 = new LinkedList<Character>(); ref1.add('s');
			  //ref1.add(8757); ref1.add('a');
			  
			  System.out.println(ref1);
			  
			  List ref2 = new ArrayList(); ref2.add("dksg"); ref2.add(27847);
			  ref2.add(457); ref2.add('g'); ref2.add(null); ref2.add(457); ref2.add(null);
			  
			  Iterator ref3 = ref2.iterator(); while (ref3.hasNext()) {
			
				  
				  System.out.println(ref3.next()); }
			  
			  System.out.println(ref2.contains('g'));
			  
			  String obj = "java is a oops lang";
			  
			  System.out.println(obj.indexOf("j"));//0
			  System.out.println(obj.indexOf("i"));//5
			  //System.out.println(obj.indexOf("a"));//0
			  System.out.println(obj.indexOf("o"));//10
			  System.out.println(obj.indexOf("l"));//15
			  
			  String sub =obj.substring(0, 4);
			  
			  System.out.println(sub);
			  
			  String sub1 =obj.substring(0, 4);
			  System.out.println(sub);
			  
			  String sub2 =obj.substring(0, 4);
			  System.out.println(sub);
			  
			  
			 Stream<String> staazr = staazr.
			
			
	}

}
