package com.homeparactice;

public class Demo {

	int ival = 10;
	double dval = 1.5;
	
	private Demo() {
		System.out.println("Private Constructor Body");
	}
	
	public static Demo g() {
		Demo ref = new Demo();
		return ref;
	}
	
	public static Demo g1() {
		Demo ref1 = new Demo();
		return ref1;
	}
	
	
	
}
