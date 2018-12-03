package com.cg.library;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//Table genearted as Person
@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//SINGLE_TABLE generates single table for parent and child
//to generate separate table use joinee
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	
	//The below annotation is used for making Id as Primary Key.
	@Id
	private int id;
	private String name;
	
	//The below annotation is used for Mapping a collection to the database.
	//@ElementCollection
	//List<Address> address = new ArrayList<>();//Person has Address. sO, PERSON_ADDRESS table is generated

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	/*
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	*/
	
}
