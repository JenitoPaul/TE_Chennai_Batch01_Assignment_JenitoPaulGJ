package com.te.consoleproject.usercredential;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.te.consoleproject.beans.PrimaryInfo;
import com.te.consoleproject.endurance.Existence;
import com.te.consoleproject.usercredential.userpage.UserChoice;


public class UserRegister extends Existence {

	final static Logger LOGGER = Logger.getLogger(UserRegister.class.getName());
	//LOGGER.setLevel(Level
	void register() {
		LOGGER.setLevel(Level.SEVERE);
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------Please Fill the Fields--------");
		System.out.println("Enter Name ");
		String name = scanner.next();
		System.out.println("Enter Gmail Address ");
		String gmail = scanner.next();
		System.out.println("Enter Mobile No");
		Long mob = scanner.nextLong();		
		System.out.println("Enter Password ");
		int pas = scanner.nextInt();
		System.out.println("ReEnter Password ");
		int pas1 = scanner.nextInt();
		if(pas==pas1) {
			System.out.println("password matched");
		}else {
			System.out.println("password mismatch");
		}
		PrimaryInfo info = new PrimaryInfo();
		info.setEmpname(name);
		info.setEmail(gmail);
		info.setMobilenumber(mob);
		info.setPassword(pas1);
		
		try {
			et = em.getTransaction();
			et.begin();
			em.persist(info);
			et.commit();
			System.out.println("------Regitered Sucessfully-----");
			UserChoice user = new UserChoice();
			user.choose(pas);
		} catch (Exception e) {
			
			//e.printStackTrace();
			et.rollback();
		} finally {
			scanner.close();
		}


	}
}
