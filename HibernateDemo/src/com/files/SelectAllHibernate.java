package com.files;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class SelectAllHibernate {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		//Query q = sess.createQuery("from com.files.LaptopPOJO");
		
		Criteria c = sess.createCriteria(LaptopPOJO.class);
		c.add(Restrictions.gt("price", 25000.00));
		
		List listObj = c.list();

		Iterator it = listObj.iterator();

		while (it.hasNext()) {
			LaptopPOJO lt = (LaptopPOJO) it.next();
			System.out.println(lt.laptopID + " " + lt.laptopName + " " + lt.price);
		}

		
	}
}
