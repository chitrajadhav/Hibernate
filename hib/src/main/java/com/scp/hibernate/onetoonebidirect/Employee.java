package com.scp.hibernate.onetoonebidirect;
import com.scp.hibernate.onetoonebidirect.Address;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee {

	@Id
    @GeneratedValue
    @Column(name = "EMP_ID")
	private int id;
	@Column
	private String empName;
	@Column
	private int empSalary;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="NewId")*/
	 @OneToOne(mappedBy="emp", cascade = CascadeType.ALL)
	 Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSalary=" + empSalary + ", address=" + address
				+ "]";
	}
	public Employee(int id, String empName, int empSalary) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
	}
	
	
}