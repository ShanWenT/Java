package com.hib.test;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e = new Employee();
		HibernateManager hm = new HibernateManager();
		e.seteID(7);
		e.seteName("Akhil");
		e.seteDept("Java");
		
		hm.connect();
		hm.insert(e);
		
	
		//hm.fetch(4);
		
		//hm.delete(5);

	}

}
