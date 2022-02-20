package com.carcare.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CarCare
 */
public class CustomerLogin extends HttpServlet 
{
	
	protected void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Model m = new Model();
		m.connect();
		m.setUsername(username);
		m.setPassword(password);
		
		int x =  m.Customerlogin();
		
		HttpSession session = req.getSession(true);
		session.setAttribute("username", username);
		
		if(x==1)
		{
			res.sendRedirect("/CarCareServicesFinal/CustomerSuccess.jsp");
		}
		else
		{
			res.sendRedirect("/CarCareServicesFinal/PageFailure.jsp");
		}
	}
}
