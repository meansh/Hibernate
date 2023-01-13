package com.cascading;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class Cascading {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		
		q1.setQuestion("Tell me who I am");
		q1.setQuestionId(1001);
		
		Answer a1 = new Answer();
		a1.setAnswer("You are Ansh");
		Answer a2 = new Answer();
		a2.setAnswer("Underrated man");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		q1.setAnswers(list);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		
		//For every question, we have to save the answers manually like below
		//But assume if if we have to save answers for which count is 1000,
		//In that case, we use Cascading
		//cascade = CascadeType.ALL) in Question class
		/*
		 * s.save(a1); s.save(a2); s.save(a3);
		 */
		
		tx.commit();
		s.close();
		factory.close();
		
		
	}
}	
