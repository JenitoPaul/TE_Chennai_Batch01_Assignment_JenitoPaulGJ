package com.homeparactice.exc;

import java.io.IOException;

public class ExctThrowThrows {

	public void method(int a,int b) throws B_is_Greater {
		if (a>b) {
			System.out.println("A is Greater");
		} else {
			throw new B_is_Greater("B is Greater");
		}
		
	}
	
}
