package com.files;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateLaptop {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();

		tx.begin();

		LaptopPOJO lp1 = (LaptopPOJO) sess.get(LaptopPOJO.class, 3);
		lp1.setPrice(35000.00);
		sess.update(lp1);

		tx.commit();
		System.out.println(lp1.price + " updated");
	}
}