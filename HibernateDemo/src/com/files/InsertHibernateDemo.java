package com.files;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertHibernateDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();

		LaptopPOJO l1 = new LaptopPOJO();

		l1.setLaptopID(4);
		l1.setLaptopName("Dell");
		l1.setPrice(19000);

		Transaction tx = sess.beginTransaction();
		tx.begin();

		sess.save(l1);
		tx.commit();

		System.out.println("Inserted");
	}
}
