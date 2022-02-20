package com.myapp.ncs;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String un = req.getParameter("un");
		String password = req.getParameter("password");
		Model m = new Model();
		m.connect();
		m.setUn(un);
		m.setPassword(password);
		
		int x = m.login();
		
		HttpSession session = req.getSession(true);
		session.setAttribute("un", un);
		
		if (x == 1) {
			res.sendRedirect("/myapp/success.jsp");
		}
		else {
			res.sendRedirect("/myapp/failureLogin.html");
		}
	}

}
