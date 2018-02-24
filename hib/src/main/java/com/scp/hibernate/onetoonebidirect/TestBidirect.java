package com.scp.hibernate.onetoonebidirect;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.scp.hibernate.onetoonebidirect.Address;
import com.scp.hibernate.onetoonebidirect.Employee;
import com.scp.hibernate.onetooneuni.HibernateUtil;
import com.scp.hibernate.onetooneuni.Student1;

public class TestBidirect {

	public static void main(String[] args) {
		Employee e1=new Employee(10,"chitra", 2000);
		Employee e2=new Employee(20,"pooja" ,3000);
		Employee e3=new Employee(30,"jyoti" ,4000);
		
		Address ad1=new Address(1,"pune",133);
		Address ad2=new Address(3,"mumbai",144);
		Address ad3=new Address(6,"goa",777);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		e1.setAddress(ad1);
		e2.setAddress(ad2);
		e3.setAddress(ad3);
		
		ad1.setEmp(e1);
		ad2.setEmp(e2);
		ad3.setEmp(e3);
			
	
	session.save(e1);
	session.save(e2);
	session.save(e3);
	
	/* Query query = session.createQuery("from USER");                 
     List <User>list = query.list();
     java.util.Iterator<User> iter = list.iterator();
     while (iter.hasNext()) {
         User user = iter.next();
         System.out.println("Person: \"" + user.getName() +"\", " + user.getUsername() +"\", " + user.getEmail());
     }*/

	/*	
  List<Employee> l=new ArrayList<Employee>();
  l.add(e1);
  l.add(e2);
  l.add(e3);

for(Employee e: l){
System.out.println("Details : "+e);
}*/

session.getTransaction().commit();
session.close();  

		
	}
}
