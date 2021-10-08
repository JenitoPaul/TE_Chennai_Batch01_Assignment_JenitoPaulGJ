package com.exceptions.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  

public class Practice {

	public void getData(int a, int b, String filename) {
		System.out.println(divide(a,b));
		fileReader(filename);
	}
	
	public int divide(int a,int b) {
		
		if(a>0 && b>0) {
			return a/b;
		}else {
			return 0;
		}	
		
	}
	
	public void fileReader(String filename) {
		
		try {
		Scanner ref = new Scanner(new File(filename));
		
		while (ref.hasNext()) {
			System.out.println(ref.nextLine());
		}
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFound");
		}
		
	}
}
