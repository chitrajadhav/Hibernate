package com.scp.hibernate.onetooneuni;

import com.scp.hibernate.onetooneuni.Student1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.scp.hibernate.onetooneuni.Address1;
import com.scp.hibernate.onetooneuni.HibernateUtil;
public class TestOneToOneU {

	public static void main(String[] args) {
		Student1 student1 = new Student1(1,"chitra");
		Student1 student2 = new Student1(2,"jyoti");
		Student1 student3 = new Student1(3,"arti");
		Address1 address1 = new Address1(10,"pune",100);
		Address1 address2 = new Address1(11,"nagar",101);
		Address1 address3 = new Address1(13,"mumai",103);
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(address1);
		student1.setAddress(address1);
		session.save(student1);
		session.save(address2);
		student2.setAddress(address2);
		session.save(student2);
		session.save(address3);
		student3.setAddress(address3);
		session.save(student3);

  List<Student1> l=new ArrayList<Student1>();
l.add(student1);
l.add(student2);
l.add(student3);
for(Student1 s: l){
System.out.println("Details : "+l);
}
		/*List<Student1> students = (List<Student1>)session.createQuery("from Student ").list();
		for(Student1 s: students){
			System.out.println("Details : "+s);
		}*/
		
		session.getTransaction().commit();
		session.close();  

		
		
	}

}
