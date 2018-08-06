package com.files;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteARowDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();

		tx.begin();

		LaptopPOJO lp1 = (LaptopPOJO) sess.get(LaptopPOJO.class, 2);
		sess.delete(lp1);

		tx.commit();
		System.out.println(lp1.laptopName + " deleted");
	}

}
