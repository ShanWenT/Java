package com.hib.test;

public class Employee {
	
	int eID;
	String eName, eDept;
	
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
		
	@Override
	public String toString() {
		
		return eID + "   " + eName + "    "+ eDept;
	}
	

}
