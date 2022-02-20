package com.ncs.onetoone;

public class EmployeeApplication {

	public static void main(String[] args) {
		Address a = new Address();
		a.setSname("75th street");
		a.setCountry("Singapore");
		
		Employee1 e = new Employee1();
		e.setEname("Eugene");
		e.setEmail("engene@gmail.com");
		e.setPhno("12345678");
		e.setAddr(a);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(e);

	}

}
