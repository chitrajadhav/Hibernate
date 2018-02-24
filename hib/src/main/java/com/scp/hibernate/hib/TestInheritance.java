package com.scp.hibernate.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInheritance {

	public static void main(String[] args) {
		A a1=new A(1,"aaa");
		B b1=new B(5,"AB",3,"bbb");
		C c1=new C(6,"AC",4,"ccc");
		
		Configuration cfg=new Configuration();
		SessionFactory session=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session1 = session.openSession();
		Transaction tr=session1.beginTransaction();
		session1.save(a1);
		session1.save(b1);
		session1.save(c1);
		tr.commit();
		//session1.flush();
		session1.close();
	}

}
