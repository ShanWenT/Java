package com.ncs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC1Pgm {

	public static void main(String[] args) {
		
		String empname, dept;
		int empid;
		// show where the Jar file is downloaded
//		rightclick on project>properties > javabuildpath
//		> libraries> add external jars(selected) and apply
		
		try {
			//load the Jar file
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Jar file is loaded");
			//connect to the database called as NCSTraining
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NCSTraining","root","root");
			System.out.println("Connected to DB");
			String s = "Select * from empdata";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(s);
			
			System.out.println("empId"+"  "+"empname"+"  "+"department");
			while(rs.next()==true) {
				empid=rs.getInt("empid");
				empname = rs.getString("empname");
				dept = rs.getString("dept");
				
				System.out.println(empid+"      "+empname+"  "+dept);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		

	}

}
