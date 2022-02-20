package com.ncs.manytoone;

public class Application {

	public static void main(String[] args) {
		CompanyInfo ci = new CompanyInfo();
		ci.setCname("Avensys");
		
		CompanyInfo ci1= new CompanyInfo();
		ci1.setCname("NCS");
		
		EmployeeInfo e1 = new EmployeeInfo();
		e1.setEname("Ivan");
		e1.setDept("JFS");
		e1.setComp(ci);
		
		EmployeeInfo e2 = new EmployeeInfo();
		e2.setEname("Shan");
		e2.setDept("Pro");
		e2.setComp(ci1);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(e1);
		hm.insert(e2);
		
		
		
		

	}

}
