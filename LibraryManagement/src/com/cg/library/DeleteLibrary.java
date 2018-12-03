package com.cg.library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteLibrary {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryManagement");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Library l1 = new Library();
		Library l2 = em.find(Library.class, 2);
		em.remove(l2);
		System.out.println("deleted......");
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
