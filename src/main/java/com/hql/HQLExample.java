package com.hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tut.Student;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();;
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String query = "from Student where Student.city =: x and Student.name =: n";
		
		Query q = session.createQuery(query);
		
		q.setParameter("x", "Noida");
		q.setParameter("n", "Anshu");
		
		List<Student> list = q.getResultList(); 
		
		for(Student student: list) {
			System.out.println(student.getName() + " : " + student.getCerti().getCourse());
		}
		
		factory.close();
		
	}
}
