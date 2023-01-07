package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating student
        Student st = new Student();
        st.setCity("Noida");
        st.setName("Ansh");
        st.setId(101);
        
        st.setCity("Noida");
        st.setName("Tony");
        st.setId(102);
        
        st.setCity("Noida");
        st.setName("Montanna");
        st.setId(104);
        
        st.setCity("Kanpur");
        st.setName("Montanna");
        st.setId(105);
        
        st.setCity("Dehradoon");
        st.setName("Chris");
        st.setId(106);
        
        System.out.println(st);
        
        //Address Object
        Address a = new Address();
        a.setCity("Kanpur");
        a.setStreet("Ramadevi");
        a.setOpen(false);
        a.setAddressId(1);
        a.setAddedDate(new Date());
        a.setImage(null);
        a.setX(123.245);
        
        //Reading image
		/*
		 * FileInputStream f = null; try { f = new
		 * FileInputStream("src/main/java/Undertaker.png"); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } try { byte[] data = new byte[f.available()];
		 * f.read(data); a.setImage(data); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
        
        System.out.println("Done creating address...");
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);        
        session.save(a);
        tx.commit();
        session.close();
       
          
    }
}
