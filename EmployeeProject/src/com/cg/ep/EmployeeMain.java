package com.cg.ep;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeMain {
	
	public static void Add() {
		
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n---------Employee--------");
			System.out.println("1.Add");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.View");
			System.out.println("5.Search By Id");
			System.out.println("6.Exit");
			
			System.out.print("Enter a option: ");
			int option = 0;
			try {
				option = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please Enter Only digits");
			}
			switch (option) {
			case 1:
				//em.getTransaction().begin();
				Employee e1 = new Employee();//create new employee object
				
				sc.nextLine();//reads space after integer
				System.out.print("Enter Name: ");
				e1.setName(sc.nextLine());
				
				System.out.print("Enter Salary: ");
				e1.setSalary(sc.nextDouble());
				em.persist(e1);
				
				System.out.println("Succesfully Added..!!");
				em.getTransaction().commit();
				em.close();
				emf.close();
				break;
			case 2:
				//em.getTransaction().begin();
				System.out.print("Enter the id to update details: ");
				Employee eObj;//updates existing employee object
				try{
					eObj = em.find(Employee.class, sc.nextInt());
					if(eObj!=null)
					{
						//sc.nextLine();//reads spaces after integer
						System.out.print("Enter Name: ");
						eObj.setName(sc.nextLine());
						
						System.out.print("Enter Salary: ");
						eObj.setSalary(sc.nextDouble());
						em.persist(eObj);

						System.out.println("updated......");
						em.persist(eObj);//always use persist to update
						em.getTransaction().commit();
					}
				}
				catch(Exception e) {
					System.err.println("Please enter a valid Id that exits in database");
				}
				em.close();
				emf.close();
				break;
			case 3:
				//em.getTransaction().begin();
				System.out.print("Enter the id to Delte: ");
				Employee e2;
				try {
					
					e2 = em.find(Employee.class, sc.nextInt());
					if(e2!=null) {
						em.remove(e2);
						System.out.println("deleted......");
						em.getTransaction().commit();
					}
				} catch (Exception e) {
					System.err.println("Please enter a valid Id that exits in database");
				}
				em.close();
				emf.close();
				break;
			case 4:
				Query q = em.createQuery("select l1 FROM Employee l1");
				List<Employee> list = q.getResultList();
				for(Employee emp: list) {
					System.out.println("=============Employee=================");
					System.out.println("Id: "+emp.getId());
					System.out.println("Name: "+emp.getName());
					System.out.println("Salary: "+emp.getSalary());
				}
				em.getTransaction().commit();
				break;
			case 5:
				System.out.print("Enter the id to search: ");
				Employee eObj1;
				try {
					
					eObj1 = em.find(Employee.class, sc.nextInt());
					if(eObj1!=null) {
						System.out.println("=============Employee=================");
						System.out.println("Id: "+eObj1.getId());
						System.out.println("Name: "+eObj1.getName());
						System.out.println("Salary: "+eObj1.getSalary());
						em.getTransaction().commit();
					}
				} catch (Exception e) {
					System.err.println("Please enter a valid Id that exits in database");
				}
				em.close();
				emf.close();
				break;
			case 6:
				System.out.println("------Thank You------");
				System.exit(0);
			default:
				System.out.println("-------Please Choose a valid Option-------");
				break;
			}
		}
	}
}
