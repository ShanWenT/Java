package com.cs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetData1
 */
@WebServlet("/GetData1")
public class GetData1 extends HttpServlet {
       
	Connection con;
	String empName, dept, empid;
   
    public void init() throws ServletException 
    {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NCSTraining","root","root");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}	
    }

	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			String s = "Select * from empdata where empid=?";
			
			empid = req.getParameter("empid");
			
			
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, empid); // arguments: number of ? + data value
			
			ResultSet rs = pstmt.executeQuery();
			PrintWriter pw = res.getWriter();
			
			
			while(rs.next()==true)
			{
				
				empName = rs.getString("empname");
				dept = rs.getString("dept");
				
				pw.println(empid+"      "+empName+"  "+dept);
			}
		
			}
		
		catch(Exception e) 
			{
				System.out.println("Some Problem");
			}
	
	}
}
