package com.sample.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sample.entity.Employee;

public class EmployeeAppIn {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee empl = new Employee();
		empl.setEmpId(245);
		empl.setEmpName("golden sparrow");
		empl.setSalary(90000);
		
		session.save(empl);
		tran.commit();
		session.close();
		factory.close();
	}

}