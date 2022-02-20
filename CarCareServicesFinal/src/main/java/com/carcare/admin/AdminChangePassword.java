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
 * Servlet implementation class AdminChangePassword
 */
@WebServlet("/achangepass")
public class AdminChangePassword extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Model m = new Model();
		m.setAusername(request.getParameter("adminUserName"));
		m.setOldapwd(request.getParameter("oldAdminPassword"));
		m.setApwd(request.getParameter("adminPassword"));
		HttpSession session = request.getSession();
//		RequestDispatcher dispatcher = null;
		
		
		if(m.getAusername() == null || m.getOldapwd() == null|| m.getApwd()==null||m.getAusername().equals("")||m.getOldapwd().equals("")||m.getApwd().equals(""))
		{
			request.setAttribute("status", "invalid");
			response.sendRedirect("/CarCareServicesFinal/alogin.jsp");
//			dispatcher = request.getRequestDispatcher("achangepass.jsp");
//			dispatcher.forward(request, response);
		}
//		if(oldapwd==null||oldapwd.equals(""))
//		{
//			request.setAttribute("status", "invalidPassword");
//			dispatcher = request.getRequestDispatcher("achangepass.jsp");
//			dispatcher.forward(request, response);
//		}
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			m.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","root");
    		PreparedStatement pst = m.con.prepareStatement("update adminAccounts set password = ? where username = ? and password = ?");
    		pst.setString(1, m.getApwd());
    		pst.setString(2, m.getAusername());
    		pst.setString(3, m.getOldapwd());
    		
    		
    		
    		
    		if(pst.executeUpdate()>0) 
    		{
//    			dispatcher = request.getRequestDispatcher("aalogin.jsp");
    			request.setAttribute("status", "changepassed");
    			response.sendRedirect("/CarCareServicesFinal/alogin.jsp");
    		}
    			
    		else 
    		{
//    			dispatcher = request.getRequestDispatcher("achangepass.jsp");
    			
    			response.sendRedirect("/CarCareServicesFinal/achangepass.jsp");
    			request.setAttribute("status", "changefailed");
    		}
//    		dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
