package com.homeparactice;

public class JavaBeanTest {

	public static void main(String[] args) {

		JavaBean ref = new JavaBean();
		
		System.out.println(ref.getIval());
		
		System.out.println(ref.getJval());
		
		ref.setIval(10);
		
		ref.setJval(20);
		
		System.out.println(ref.getIval());//10
		
		System.out.println(ref.getJval()); 
	}

}
