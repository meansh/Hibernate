package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String[] args) {
		
		System.out.println("Program running...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		
		
		//Transient state
		Student student = new Student();
		student.setId(1414);
		student.setCity("Noida");
		student.setName("Anshu");
		student.setCerti(new Certificate("Java", "2 months"));
		//Transient state end
		
		//Persistent state
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		
		
		tx.commit();
		f.close();
		//Persistent state end
		
		//Detatched state
		s.close();
		
		//Removed state
		/* Call remove method here */
		
		
	}
}
