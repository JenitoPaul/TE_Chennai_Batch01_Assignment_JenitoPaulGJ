package com.te.consoleproject.usercredential;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;

public class UserLogin {


	public void sample() {
		LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);
		try {
		System.out.println("------Welcome------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Already Registered Press '1'   ");
		System.out.println("New User Press '2'  ");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter User Credentials ");
			LoginForm loginForm = new LoginForm();
			loginForm.test();
			break;
			
		case 2:
			UserRegister userRegister = new UserRegister();
			userRegister.register();
			break;
		
		default:
			System.out.println("Invalid Option re-enter the option");
			break;
		}
		}catch(Exception e){
			System.out.println("Invalid Option");
			e.printStackTrace();
		}finally {
			//scanner.close();
		}
		
		
	}
	
	
	
	
	
}
