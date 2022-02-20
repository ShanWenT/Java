package com.mvc.data;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model 
{
	
	Connection con;
	private String empid;
	private String empname;
	private String dept;
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	void connect() {
		
		try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NCSTraining","root","root");
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("some problem");
    	}	
	}
	
	void fetchData() 
	{
		try 
		{
			String s = "Select * from empdata where empid=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, empid); // arguments: number of ? + data value
			
			ResultSet rs = pstmt.executeQuery();
		
			while(rs.next()==true)
			{
				
			empname = rs.getString("empname");
			dept = rs.getString("dept");
			}
		}
		
		catch(Exception e) 
		{
			System.out.println("Some Problem");
		}		
	}
	
}
