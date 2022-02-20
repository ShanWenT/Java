package com.ncs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPgm6 {

	public static void main(String[] args) {
		
		String empname, dept, newDept;
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
			
			String s = "update empdata set dept =?  where empid =? AND dept =?";
		
			System.out.println("Enter the Employee ID: ");
			empid = sc.nextInt();
			
			System.out.println("Enter the Employee dept: ");
			dept = sc.next();
			
			System.out.println("Enter the Employee new dept: ");
			newDept = sc.next();
			
			PreparedStatement pstmt = con.prepareStatement(s);               
			pstmt.setString(1, newDept);
			pstmt.setInt(2, empid);
			pstmt.setString(3, dept);
			
			pstmt.executeUpdate();
			System.out.println("Data updated");
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		

	}

}