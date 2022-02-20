package com.myapp.ncs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Model {
	
	Connection con;
	private String uid, name, un, password;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
void connect() {
		
		try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NCSTraining","root","root");
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}	
	}

int login() {
	try 
	{
		String s = "Select * from myapp where un=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(s);
		pstmt.setString(1, un); // arguments: number of ? + data value
		pstmt.setString(2, password);
		
		ResultSet rs = pstmt.executeQuery();
	
		if(rs.next()==true)
		{
			
		return 1;
		}
		else 
		{
			return 0;
		}
	}
	
	catch(Exception e) 
	{
		System.out.println("Some Problem");
	}
	return 0;
}
}
