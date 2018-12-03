package com.cg.library;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectQuery {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryManagement");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//Query q = em.createQuery("select l1 FROM Library l1");
		Query q = em.createNamedQuery("select_library");
		List<Library> list = q.getResultList();
		for(Library lib: list) {
			System.out.println("==============================");
			System.out.println("Id: "+lib.getId());
			System.out.println("Id: "+lib.getBookName());
			System.out.println("Id: "+lib.getBookPrice());
		}
		em.getTransaction().commit();
	}

}
