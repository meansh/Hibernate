package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
		Question question1 = new Question();
		question1.setQuestion("What is Java");
		question1.setQuestionId(201);

		// creating answer
		Answer answer1 = new Answer();
		answer1.setAnswer("Java is a programming language");
		answer1.setAnswerId(343);
		answer1.setQuestion(question1);

		// creating answer
		Answer answer2 = new Answer();
		answer2.setAnswerId(344);
		answer2.setAnswer("Java ha varities of methods..");
		answer2.setQuestion(question1);

		Answer answer3 = new Answer();
		answer3.setAnswerId(345);
		answer3.setAnswer("Java has different types of framework..");
		answer3.setQuestion(question1);

		
		  List<Answer> list = new ArrayList<Answer>(); 
		  list.add(answer1);
		  list.add(answer2); 
		  list.add(answer3);
		  
		  question1.setAnswers(list);
		 
		

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		
		  //s.save(question1); s.save(answer1); s.save(answer2); s.save(answer3);
		 	
		
		Question q = (Question) s.get(Question.class, 201);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		//System.out.println(q.getAnswers().size());
		
		tx.commit();
		factory.close();

	}

}
