package com.ncs.Const;

public class Employee2 {

	int empid;
	String empname;
	
	public Employee2() {
		
	}
	
	public Employee2(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee2 [empid=" + empid + ", empname=" + empname + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
