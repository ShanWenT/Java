package com.ncs.project;


import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Model m= new Model();
		m.setAusername(req.getParameter("adminUserName"));
		m.setApwd(req.getParameter("adminPassword"));
		HttpSession session = req.getSession();
		m.connect();

	
	
	if(m.getAusername() == null || m.getAusername().equals("") || m.getApwd()==null||m.getApwd().equals(""))
	{
		session.setAttribute("status", "invalid");
		res.sendRedirect("/CarCareServicesFinal/AdminLogin.jsp");
	}
	
	try {
		PreparedStatement pst = m.con.prepareStatement("select * from adminAccounts where username = ? and password = ?");
		pst.setString(1, m.getAusername());
		pst.setString(2, m.getApwd());
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			session.setAttribute("name", rs.getString("name")); 
			res.sendRedirect("/CarCareServicesFinal/AdminIndex.jsp");
//			dispatcher = request.getRequestDispatcher("index.jsp");
		}
		else 
		{
			session.setAttribute("status", "failed");
			res.sendRedirect("/CarCareServicesFinal/AdminLogin.jsp");
			
//			dispatcher = request.getRequestDispatcher("login.jsp");
		}
//		dispatcher.forward(request, response);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
