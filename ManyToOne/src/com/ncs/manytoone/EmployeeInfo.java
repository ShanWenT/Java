package com.ncs.manytoone;

public class EmployeeInfo {

	int eid;
	String ename;
	String dept;
	CompanyInfo comp;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public CompanyInfo getComp() {
		return comp;
	}
	public void setComp(CompanyInfo comp) {
		this.comp = comp;
	}
	

	
}
