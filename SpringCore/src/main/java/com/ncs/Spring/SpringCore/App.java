package com.ncs.Spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.Spring.SpringCore.Employee;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	    Employee e1 = (Employee) ac.getBean("e1");
	     System.out.println(e1);
	     
	     Employee e2 = (Employee) ac.getBean("e2");
	     System.out.println(e2);
	     
	     Employee e3 = (Employee) ac.getBean("e3");
	     System.out.println(e3);



	}

}
