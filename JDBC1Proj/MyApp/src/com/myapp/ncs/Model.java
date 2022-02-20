package com.myapp.ncs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;



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
	void connect()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Jar file is loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NCSTraining","root","password");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	int login() {
		try {
			String s = "Select * from myapp where un =? and password = ? "; //? = Place holder
						
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1,un);
			pstmt.setString(2,password);
			
			ResultSet rs = pstmt.executeQuery();
				
			if(rs.next() == true) {
				return 1;
			}
			else {
				return 2;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
