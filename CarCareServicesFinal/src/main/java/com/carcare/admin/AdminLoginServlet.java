package com.carcare.admin;

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

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/alogin")
public class AdminLoginServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String aname = request.getParameter("");
		Model m= new Model();
		m.setAusername(request.getParameter("adminUserName"));
		m.setApwd(request.getParameter("adminPassword"));
		HttpSession session = request.getSession();
//		RequestDispatcher dispatcher = null;
		
		if(m.getAusername() == null || m.getAusername().equals("") || m.getApwd()==null||m.getApwd().equals(""))
		{
			session.setAttribute("status", "invalid");
			response.sendRedirect("/CarCareServicesFinal/alogin.jsp");
//			dispatcher = request.getRequestDispatcher("login.jsp");
//			dispatcher.forward(request, response);
		}
//		if(apwd==null||apwd.equals(""))
//		{
//			request.setAttribute("status", "invalidPassword");
//			response.sendRedirect("/CarCareProj/login.jsp");
////			dispatcher = request.getRequestDispatcher("login.jsp");
////			dispatcher.forward(request, response);
//		}
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
    		m.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");
    		PreparedStatement pst = m.con.prepareStatement("select * from adminAccounts where username = ? and password = ?");
    		pst.setString(1, m.getAusername());
    		pst.setString(2, m.getApwd());
    		
    		ResultSet rs = pst.executeQuery();
    		
    		if(rs.next()) {
    			session.setAttribute("name", rs.getString("name")); 
    			response.sendRedirect("/CarCareServicesFinal/aindex.jsp");
//    			dispatcher = request.getRequestDispatcher("index.jsp");
    		}
    		else 
    		{
    			session.setAttribute("status", "failed");
    			response.sendRedirect("/CarCareServicesFinal/alogin.jsp");
    			
//    			dispatcher = request.getRequestDispatcher("login.jsp");
    		}
//    		dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
