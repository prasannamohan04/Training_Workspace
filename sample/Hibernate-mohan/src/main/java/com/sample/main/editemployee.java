package com.sample.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sample.entity.Employee;

public class editemployee {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();

		Employee empl = session.get(Employee.class,3456 );
		empl.setEmpName("bahubali");
		session.remove(empl);
		tran.commit();
		session.clear();
		factory.close();
	}

}
