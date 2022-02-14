package com.ncs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPgm3 {

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
			
			String s = "Insert into empdata values(?,?,?)";
			
			System.out.println("Enter emp Name");
			empname = sc.nextLine();
			System.out.println("Enter Department");
			dept=sc.nextLine();
			System.out.println("Enter the Employee ID: ");
			empid = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setInt(1, empid); // arguments: number of ? + data value
			pstmt.setString(2, empname);
			pstmt.setString(3, dept);
			
			pstmt.executeUpdate();
			System.out.println("Data inserted");
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		

	}

}