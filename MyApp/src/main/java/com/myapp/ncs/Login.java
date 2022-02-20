package com.myapp.ncs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String un = req.getParameter("un");
		String pw = req.getParameter("pw");
		
		Model m = new Model();
		m.connect();
		
		m.setUn(un);
		m.setPassword(pw);
		
		int x = m.login();
		
		HttpSession session = req.getSession(true);
		session.setAttribute("un", un);
		
		if(x==1)
		{
			res.sendRedirect("/MyApp/success.jsp");
		}
		else {
			res.sendRedirect("/MyApp/failureLogin.html");
		}
	}
       
   

}
