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

public class AdminChangePassword extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Model m = new Model();
			m.setAusername(request.getParameter("adminUserName"));
			m.setOldapwd(request.getParameter("oldAdminPassword"));
			m.setApwd(request.getParameter("adminPassword"));
			HttpSession session = request.getSession();
			m.connect();
			
			
			if(m.getAusername() == null || m.getOldapwd() == null|| m.getApwd()==null||m.getAusername().equals("")||m.getOldapwd().equals("")||m.getApwd().equals(""))
			{
				request.setAttribute("status", "invalid");
				response.sendRedirect("/CarCareServicesFinal/AdminChangePassword.jsp");
			}

			try {
				
	    		PreparedStatement pst = m.con.prepareStatement("update adminAccounts set password = ? where username = ? and password = ?");
	    		pst.setString(1, m.getApwd());
	    		pst.setString(2, m.getAusername());
	    		pst.setString(3, m.getOldapwd());
	    		
	    		if(pst.executeUpdate()>0) 
	    		{
	    			request.setAttribute("status", "changepassed");
	    			response.sendRedirect("/CarCareServicesFinal/AdminLogin.jsp");
	    		}
	    			
	    		else {	    			
	    			response.sendRedirect("/CarCareServicesFinal/AdminChangePassword.jsp");
	    			request.setAttribute("status", "changefailed");
	    		}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
}
