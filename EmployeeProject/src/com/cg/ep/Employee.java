package com.cg.ep;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="employee_details")
@TableGenerator(name="tab_Seq",initialValue=1,allocationSize=1)
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="tab_Seq")
	private int Id;
	@Column(name="ename")
	private String name;
	@Column(name="esal")
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
