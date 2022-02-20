package com.ncs.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;
public class HibernateManager 
{
	Session session;
	public void connect()
	{
	//Connection code
		// these 5 lines would remain same and is used for getting connection
       Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   	 
        session =sessionFactory.openSession();	
        System.out.println("Connected to Pf....");
	}
	
	void insert(Employee1 e)
	{
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		System.out.println("Employee data is inserted");
		
	}
	
	void fetch(int empid)
	{
		Transaction t = session.beginTransaction();
		Employee1 em = (Employee1) session.get(Employee1.class, empid);
		System.out.println(em);
	}
	
	void delete(int empid)
	{
		Transaction t = session.beginTransaction();
		Employee1 em = (Employee1) session.get(Employee1.class, empid);
		session.delete(em);
		t.commit();
		System.out.println("Data of emp with empID"+empid+"is deleted");
	}
}