package com.homeparactice;

public class ThreadUsingThreadClass2Test {

	public static void main(String[] args) {

		ThreadUsingThreadClass o = new ThreadUsingThreadClass();
		Runnable obj = ()->{
			o.name(10);
		};
				
		Thread ref = new Thread(o);
		ref.start();
		
		Thread ref1 = new Thread(obj);
		ref1.start();

		
	}

}
