package com.cg.library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name="tab_Seq",initialValue=1,allocationSize=1)
@NamedQuery(name="select_library" , query="select l1 from Library l1")//At Class Level
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="tab_Seq")
	private int id;
	private String bookName;
	private double bookPrice;
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}
	
