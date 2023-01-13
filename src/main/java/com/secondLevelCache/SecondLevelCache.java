package com.secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondLevelCache {
	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session1 = factory.openSession();
		
		Student student1 = session1.get(Student.class, 12);
		
		System.out.print(student1);
		
		session1.close();
		
		Session session2 = factory.openSession();
		
		Student student2 = session2.get(Student.class, 12);
		System.out.print(student2);
		
		session2.close();
		
		
	}
}
