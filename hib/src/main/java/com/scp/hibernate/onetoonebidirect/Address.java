package com.scp.hibernate.onetoonebidirect;
import com.scp.hibernate.onetoonebidirect.Employee;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.scp.hibernate.onetoonebidirect.Employee;

@Entity
@Table(name="AddressE")

public class Address {
	@Id
    @GeneratedValue
    @Column(name = "Addr_ID")
	private int id;
	@Column(name = "City")
	private String city;
	@Column(name = "Pin")
	private int pin;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	//@JoinColumn
	Employee emp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", pin=" + pin + ", emp=" + emp + "]";
	}
	public Address(int id, String city, int pin) {
		super();
		this.id = id;
		this.city = city;
		this.pin = pin;
	}
	public Address() {
		super();
	}
	

}
