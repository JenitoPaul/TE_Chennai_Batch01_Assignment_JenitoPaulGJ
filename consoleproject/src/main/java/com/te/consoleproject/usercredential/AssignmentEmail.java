package com.te.consoleproject.usercredential;
import java.util.ArrayList;
import java.util.List;
public class AssignmentEmail {
	//Set 1
	//Question no : 3
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(70);
		list1.add(20);
		list1.add(80);
		list1.add(40);
		list1.add(10);
		list1.add(90);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if (list.get(i) == list1.get(j)) {
					System.out.println(list.get(i));
				}
			}
		}
	}
}
