package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class Pagination {
	public static void main(String[] args) {
		 	SessionFactory session = new Configuration().configure().buildSessionFactory();
		 	Session s = session.openSession();
		 	
		 	Query<Student> query = s.createQuery("from Student", Student.class);
		 	
		 	//Implementing pagination using Hibernate
		 	query.setFirstResult(0);
		 	
		 	query.setMaxResults(5);
		 	
		 	List<Student> list = query.list();
		 	
		 	for(Student st: list) {
		 		System.out.println(st.getName() + "  :  " + st.getCity());
		 	}
		 	
		 	
		 	s.close();
		 	session.close();
	
	}
}
