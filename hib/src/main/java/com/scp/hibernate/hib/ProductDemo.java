package com.scp.hibernate.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDemo {

			public static void main(String[] args) {
				/*
				//openSession() and getCurrentSession() difference
				Product p1=new Product(1,"aaa");
				Product p2=new Product(2,"bbb");
				
				Configuration cfg=new Configuration();
				SessionFactory sf=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
				Session session1 = sf.openSession();
				//Session session1 = sf.getCurrentSession();
				Transaction tr=session1.beginTransaction();
				session1.save(p1);
				session1.save(p2);
				session1.flush();
				tr.commit();
				session1.close();*/
				
				
				/*//load and get
				Product p1=new Product(1,"aaa");
				
				Configuration cfg=new Configuration();
				SessionFactory sf=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
				Session session1 = sf.openSession();
				Transaction tr=session1.beginTransaction();
				session1.save(p1);
				tr.commit();
				
				
				Product p3 = (Product) session1.get(Product.class,1);
				
				System.out.println("Fetch object with load");
				Product p4 = (Product) session1.load(Product.class,1);
				
				System.out.println("Print result of get");
				System.out.println(p3);
				
				System.out.println("Print result of load");
				System.out.println(p4);
				
				Transaction tr1=session1.beginTransaction();
				
				
				session1.save(p3);
				session1.save(p4);
				session1.flush();
				tr1.commit();
				session1.close();*/
				
				/*//update and Merge
				Product p1=new Product(1,"aaa");
				Product p2=new Product(2,"bbb");
				Configuration cfg=new Configuration();
				SessionFactory sf=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
				Session session1 = sf.openSession();
				Transaction tr1=session1.beginTransaction();
				Product p3=(Product) session1.get(Product.class, 1);
				tr1.commit();
				session1.close();
				//p3.setPname("chitra");
				
				Session session2 = sf.openSession();
				Product p4=(Product) session2.get(Product.class,1);
				p3.setPname("chitra");
				session2.update(p3);
				//session2.update(p4);
				//session2.merge(p1);
				
				*/
				
				
				
                    //persist and save
                    Product p1=new Product(1,"cccc");
				
				Configuration cfg=new Configuration();
				SessionFactory session=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
				Session session1 = session.openSession();
				Transaction tr=session1.beginTransaction();
				//int reult=(Integer) session1.save(p1);
				tr.commit();
				session1.flush();
				//session1.close();
				int reult=(Integer) session1.save(p1);
			    
			    System.out.println(reult);
			    
				
						
				
				//for annotation
				/*Product p1=new Product(1,"cccc");
				
				Configuration cfg=new Configuration();
				SessionFactory session=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
				Session session1 = session.openSession();
				Transaction tr=session1.beginTransaction();
				
				session1.save(p1);
				tr.commit();
				session1.flush();
				session1.close();*/
			}


	}


