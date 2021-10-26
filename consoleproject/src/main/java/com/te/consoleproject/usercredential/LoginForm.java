package com.te.consoleproject.usercredential;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import javax.persistence.Query;
import com.te.consoleproject.beans.PrimaryInfo;
import com.te.consoleproject.endurance.Existence;
import com.te.consoleproject.usercredential.userpage.UserChoice;

public class LoginForm extends Existence {
	public void test() {
		System.out.println("-------Login Page------");

		LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);
		
		try {
			Scanner scanner = new Scanner(System.in);
			String update = "from PrimaryInfo where " + "empname=:en and password =:pwd";
			Query query = em.createQuery(update);
			System.out.println("Enter Employee/User Name");
			query.setParameter("en", scanner.next());
			System.out.println("Enter Password");
			int pas = scanner.nextInt();
			query.setParameter("pwd", pas);
			List<PrimaryInfo> list1 = query.getResultList();
			System.out.println(list1.get(0));
			if (list1.size() == 1) {
				System.out.println("Login Successfully");
				UserChoice user1 = new UserChoice();
				user1.choose(pas);
			} else {
				System.out.println("Invalid Credentials");
			}

		} catch (Exception e) {
//e.printStackTrace();
			System.out.println("Invalid User_name or Password");
		}
	}
}
