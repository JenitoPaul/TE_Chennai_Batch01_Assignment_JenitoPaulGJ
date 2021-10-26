package com.homeparactice;

public class ThreadUsingThreadClass extends Thread{

	@Override
	public void run() {
	
		System.out.println("run method");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*2);
		}
	}
	
	public void name(int a) {
		
		System.out.println("new method");
		for (int i = 1; i <= 10; i++) {
			System.out.println(a+i);
		}
	}
}
