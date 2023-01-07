package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] a) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	    //get-student:106
		/*
		 * Student student = (Student)session.get(Student.class, 106);
		 * System.out.println(student);
		 */
		
		Address ad = (Address)session.get(Address.class, 2);
		System.out.println("Address details: " + ad.getStreet() + " " + ad.getAddressId());
		
		session.close();
		factory.close();
	
	}
}
