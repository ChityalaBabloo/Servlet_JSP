package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistCustomer {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Customer c = new Customer();
		c.setId(123);
		c.setName("MuKESH");
		c.setCity("mumbai");
		em.persist(c);
		em.getTransaction().commit();
		System.out.println("customer entity is persisted.....");
	}

}
