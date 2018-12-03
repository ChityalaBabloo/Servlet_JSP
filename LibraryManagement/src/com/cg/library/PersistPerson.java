package com.cg.library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistPerson {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryManagement");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee e1 = new Employee(101,"HARISH",55500.00);
		em.persist(e1);
		System.out.println("Done successfully");
		
		em.getTransaction().commit();
	}

}
