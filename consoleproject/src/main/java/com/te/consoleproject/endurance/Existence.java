
 package com.te.consoleproject.endurance;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Existence implements AutoCloseable   {

	protected Scanner scanner = new Scanner(System.in);
	
	protected EntityManagerFactory emf= Persistence.createEntityManagerFactory("project_jenito");
	
	protected EntityManager em = emf.createEntityManager();
	
	protected EntityTransaction et = em.getTransaction();

	@Override
	public void close() throws Exception {
		emf.close();
		em.close();
		scanner.close();
	}

	
}
