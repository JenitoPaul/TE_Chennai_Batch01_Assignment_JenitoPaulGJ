package com.homeparactice.exc;

import java.io.IOException;

public class ExctThrowThrowsTest {

	public static void main(String[] args) {

		ExctThrowThrows ref = new ExctThrowThrows();
		
		
			
				try {
					ref.method(10, 20);
				} catch (B_is_Greater e) {
					
					System.out.println(e.getMessage());
				}
		
			

	}
	

}
