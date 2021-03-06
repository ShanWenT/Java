package com.ncs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPgm2 {

	public static void main(String[] args) {
		
		String empname, dept;
		int empid;
		Scanner sc = new Scanner(System.in);
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
			String s = "Select * from empdata where empid=?";
			System.out.println("Enter the Employee ID: ");
			empid = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setInt(1, empid); // arguments: number of ? + data value
			
			ResultSet rs = pstmt.executeQuery();
			
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