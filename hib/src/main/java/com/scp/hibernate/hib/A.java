package com.scp.hibernate.hib;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="TableA")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="Parent_colum")
public class A {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="A_ID")
	int id;
	String name;
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
		return "A [id=" + id + ", name=" + name + "]";
	}
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public A() {
		super();
	}
	

}
@Entity
@Table(name="TableB")
/*@AttributeOverrides({
    @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME"))
})*/
 class B extends A{
	int idb;
	String nameb;
	public int getIdb() {
		return idb;
	}
	public void setIdb(int idb) {
		this.idb = idb;
	}
	public String getNameb() {
		return nameb;
	}
	public void setNameb(String nameb) {
		this.nameb = nameb;
	}
	@Override
	public String toString() {
		return "B [idb=" + idb + ", nameb=" + nameb + "]";
	}
	public B(int id, String name, int idb, String nameb) {
		super(id, name);
		this.idb = idb;
		this.nameb = nameb;
	}
	public B() {
		super();
	}
	

}
@Entity
@Table(name="TableC")

/*@AttributeOverrides({
    @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME"))
})*/
class C extends A{
	int idc;
	String namec;
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	public String getNamec() {
		return namec;
	}
	public void setNamec(String namec) {
		this.namec = namec;
	}
	@Override
	public String toString() {
		return "C [idc=" + idc + ", namec=" + namec + "]";
	}
	public C(int id, String name, int idc, String namec) {
		super(id, name);
		this.idc = idc;
		this.namec = namec;
	}
	public C() {
		super();
	}
	

}