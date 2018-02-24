package com.scp.hibernate.onetooneuni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.scp.hibernate.onetooneuni.Address1;

@Entity
@Table(name = "STUDENT")
public class Student1 {

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private int id;
	
	@Column(name = "STUDENT_NAME")
	private String name;
	
	//Unidirectional 3 TYPE
    


   /* Unidirectional=TYPE:join Table
      @OneToOne(cascade=CascadeType.ALL)
      @JoinTable(name="Join_Table",joinColumns=@JoinColumn(name="Stud_id"),inverseJoinColumns=@JoinColumn(name="Add_id"))

*/

	//3) Unidirectional :TYPE:Primary Key Join column
	  /* @OneToOne(cascade=CascadeType.ALL)
	   @PrimaryKeyJoinColumn
	 
*/
	
	//@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
   
	// for Unidirectional -join column
	
    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name="HOME_ADDRESS_ID")
	private Address1 address;
	
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
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student1() {
		
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	
	
	
}
