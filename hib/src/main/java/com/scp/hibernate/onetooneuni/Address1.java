
package com.scp.hibernate.onetooneuni;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ADDRESS")
public class Address1 {
	
@Id 
@GeneratedValue //for join columm
//@Column(name = "ADDRESS_ID")	
private int aid;
	
@Column(name = "CITY")
private String city;

@Column(name = "PINCODE")
private int pin;

/*@OneToOne(cascade=CascadeType.ALL)
//@PrimaryKeyJoinColumn
 @JoinColumn 
 */
// private Student1 student;
	
	
/*public Student1 getStudent() {
	return student;
}
public void setStudent(Student1 student) {
	this.student = student;
}*/
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
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
@Override
public String toString() {
	return "Address [aid=" + aid + ", city=" + city + ", pin=" + pin + "]";
}
public Address1(int aid, String city, int pin) {
	super();
	this.aid = aid;
	this.city = city;
	this.pin = pin;
}
public Address1() {
	
}

}
