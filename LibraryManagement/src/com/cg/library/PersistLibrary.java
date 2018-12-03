package com.cg.library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistLibrary {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryManagement");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Library l1 = new Library();
		l1.setBookName("java");
		l1.setBookPrice(399.00);
		
		Library l2 = new Library();
		l2.setBookName("Angular");
		l2.setBookPrice(1399.00);
		
		em.persist(l1);
		em.persist(l2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
