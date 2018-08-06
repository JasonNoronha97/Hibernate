package com.files;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PassportsDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		
		Passport pass = new Passport();
		pass.setPpID(12);
		pass.setPpName("INDIA");
		
		Person pers = new Person();
		pers.setpID(12);
		pers.setpName("Jason");
		pers.setPp(pass);

		Transaction tx1 = sess.beginTransaction();
		
		tx1.begin();
		
		sess.save(pers);
		sess.save(pass);
		
		tx1.commit();
		System.out.println("DONE");
	}

}
