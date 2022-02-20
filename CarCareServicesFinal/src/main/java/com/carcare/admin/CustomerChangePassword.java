package com.carcare.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class CustomerChangePassword
 */
public class CustomerChangePassword extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String newCustomerPassword = req.getParameter("newCustomerPassword");
		
		Model m = new Model();
		m.connect();
		m.setUsername(username);
		m.setPassword(password);
		m.setNewCustomerPassword(newCustomerPassword);
		int x = m.CustomerChangePassword();
		if (x == 1) {
			res.sendRedirect("/CarCareServicesFinal/CustomerChangePasswordSuccessful.jsp");
		}
		else {
			res.sendRedirect("/CarCareServicesFinal/CustomerSuccess.jsp");

		}
		
	}
}
