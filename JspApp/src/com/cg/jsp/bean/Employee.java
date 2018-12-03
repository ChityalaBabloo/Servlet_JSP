package com.cg.jsp.bean;
//pojo class: plain old java object class

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		System.out.println("default constructor");
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
