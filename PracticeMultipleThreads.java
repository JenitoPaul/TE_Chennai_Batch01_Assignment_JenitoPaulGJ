package com.te.threads.threadclass.threadtest;

public class PracticeMultipleThreads {

	public void tab(int a) {
		for (int i = 1; i <=10; i++) {
			System.out.println(a*i);
		}
	}
	
	public static void main(String[] args) {
		
		PracticeMultipleThreads ref = new PracticeMultipleThreads();
		
		Runnable thd1 = ()->{
			synchronized (ref) {
				System.out.println("------Thread one--------");
				ref.tab(10);
			}
		};
		
		Runnable thd2 = ()->{
			synchronized (ref) {
				System.out.println("------Thread two--------");
				ref.tab(5);
			}
		};
	
		Runnable thd3 = ()->{
			synchronized (ref) {
				System.out.println("------Thread three--------");
				ref.tab(15);
			}
		};

		Thread hd1 = new Thread(thd1);
		Thread hd2 = new Thread(thd2);
		Thread hd3 = new Thread(thd3);
		
		hd1.start();
		hd2.start();
		hd3.start();
		
	}
}
