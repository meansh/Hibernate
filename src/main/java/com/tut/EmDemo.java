package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			
			Student student1 = new Student();
			student1.setId(12);
			student1.setName("Abc");
			student1.setCity("LKO");
			
			Certificate certi1 = new Certificate();
			certi1.setCourse("Android");
			certi1.setDuration("2 months");			
			student1.setCerti(certi1);
			
			Student student2 = new Student();
			student2.setId(13);
			student2.setName("Abc");
			student2.setCity("LKO");
			
			Certificate certi2 = new Certificate();
			certi2.setCourse("Hibernate");
			certi2.setDuration("1.5 months");			
			student2.setCerti(certi2);
			
			Session s = factory.openSession();
			Transaction tx = s.beginTransaction();
			
			s.save(student1);
			s.save(student2);
			
			tx.commit();
			s.close();
			factory.close();
			
		}
}
