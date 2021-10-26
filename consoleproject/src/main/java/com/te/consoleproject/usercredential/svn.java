package com.te.consoleproject.usercredential;

import java.sql.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.consoleproject.beans.PrimaryInfo;
import com.te.consoleproject.endurance.Existence;

public class svn extends Existence {

public static void main(String[] args) {
	



	
				
		try {
			Scanner scanner = new Scanner(System.in);
			
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("project_jenito");
			
			EntityManager em = emf.createEntityManager();
//		
			EntityTransaction et = em.getTransaction();
			et.begin();
			String update = "update PrimaryInfo set role=:na,hiredate=:date,"
					+ "sal=:sal,deptno=:deptno,deptname=:deptname,"
					+ "commission=:comm,empno=:empno where password =:ps";

			
			Query query = em.createQuery(update);
			System.out.println("enter password");
			query.setParameter("ps", scanner.nextInt());
			System.out.println("1. enter role");
			query.setParameter("na", scanner.next());
			System.out.println("2. enter hiredate");
			query.setParameter("date", Date.valueOf(scanner.next()));
			System.out.println("3. enter Salary");
			query.setParameter("sal",scanner.nextDouble());
			System.out.println("4. enter dept no");
			query.setParameter("deptno", scanner.nextInt());
			System.out.println("5. enter dept name");
			query.setParameter("deptname", scanner.next());
			System.out.println("6. enter commission");
			query.setParameter("comm", scanner.nextDouble());
			System.out.println("7. enter emp no");
			query.setParameter("empno", scanner.nextInt());
			
			
			
			int res = query.executeUpdate();
			System.out.println("no of rows affected "+ res);
			et.commit();
			em.close();
			emf.close();
	}catch (Exception e) {
e.printStackTrace();	}
}
}
