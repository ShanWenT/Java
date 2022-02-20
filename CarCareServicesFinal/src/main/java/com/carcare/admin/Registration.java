package com.carcare.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {
		
		protected void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String username = req.getParameter("username");
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String phoneno = req.getParameter("phoneno");
			
			Model m = new Model();
			m.connect();
			
			
			m.setUsername(username);
			m.setPassword(password);
			m.setName(name);
			m.setPhoneno(phoneno);	
			m.register();
			
			
			res.sendRedirect("/CarCareServicesFinal/RegistrationSuccessful.jsp");
		}

		

	}
