package com.te.consoleproject.usercredential.userpage;

import java.util.Scanner;

public class UserChoice {

	public void choose(int pas) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Welcome to User Page");
			System.out.println("choose the option based on your need");
			System.out.println("To View your Details press 1");
			System.out.println("To Edit/Update your Details press 2");
			System.out.println("To Delete your Details press 3");

			int a = scanner.nextInt();
			switch (a) {
			case 1:
				ViewDetails see = new ViewDetails();
				see.view(pas);
				break;
			case 2:
				UpdateDetails insertDetails = new UpdateDetails();
				insertDetails.update(pas);
				break;
			case 3:
				DeleteDetails deletedetails = new DeleteDetails();
				deletedetails.delete(pas);
				break;
			default:
				System.out.println("Choose correct option");
				break;
			}
		} catch (Exception e) {
			System.out.println("Choose correct option");
		} finally {
			scanner.close();
		}
	}
}
