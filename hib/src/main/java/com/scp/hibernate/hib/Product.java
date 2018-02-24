package com.scp.hibernate.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@Column(name="product_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_NAME")
	 private String pname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Product(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + "]";
	}
	public Product() {
		super();
	}
	
	

}
