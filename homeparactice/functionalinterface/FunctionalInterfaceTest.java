package com.homeparactice.functionalinterface;

public abstract class FunctionalInterfaceTest implements InterfaceFunc {

	/*
	 * public void print() { System.out.println("imp of functional interface"); }
	 */
	public static void main(String[] args) {
		
	
		InterfaceFunc ref= () ->{
			System.out.println("imp 1 of interface using lamda func ");
		};
		
		
		InterfaceFunc ref1= () ->{
			System.out.println("imp 2 of interface using lamda func ");
		};
		ref1.print();
		
		ref.print();
	}

	
		
		
		

}
