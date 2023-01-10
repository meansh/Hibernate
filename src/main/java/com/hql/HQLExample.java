package com.hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tut.Student;
import org.hibernate.Transaction;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();;
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		System.out.println("____________________________________");
		Transaction  tx = session.beginTransaction();
		
		/* Update query */
		/*
		 * String query = "update Student set city=:c where name=:n"; Query q =
		 * session.createQuery(query); q.setParameter("c", "Johannesberg");
		 * q.setParameter("n", "Anshu"); int r = q.executeUpdate(); System.out.println(r
		 * + " objects updated.");
		 */
		
		/*Delete query */
		String query = "delete from Student s where s.city=: c";
		Query q = session.createQuery(query);
		q.setParameter("c", "Johannesberg");
		int r = q.executeUpdate();
		System.out.println("Deleted: " + r);
		
		tx.commit();
		session.close();
		factory.close();
		
	}
}
