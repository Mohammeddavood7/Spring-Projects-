package com.test.testing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernates.model.Employee;

public class Hibernate01
{
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("/hibernate.cfg.xml"); 
		SessionFactory factory = config.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction tx = openSession.beginTransaction();
		Employee emp = new Employee(13,"murty","ameerpet",10000d);
		openSession.save(emp);
		
		
		tx.commit();
		openSession.close();

		
	}

	

}
