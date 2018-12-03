package com.cg.library;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateLiberary {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryManagement");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id to update details");
		Library l1;
		try{
			l1 = em.find(Library.class, sc.nextInt());
			if(l1!=null)
			{
				l1.setBookName("snake");
				l1.setBookPrice(300.00);
				System.out.println("updated......");
				em.persist(l1);//always use persist to update
				em.getTransaction().commit();
			}
		}
		catch(Exception e) {
			System.out.println("Please enter a valid Id that exits in database");
		}
		em.close();
		emf.close();
	}
}

