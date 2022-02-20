package com.mvc.data;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Data extends HttpServlet 
{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String empid = req.getParameter("empid");
		Model m = new Model();
		m.setEmpid(empid);
		
		m.connect();
		m.fetchData();
		
		String empname = m.getEmpname();
		String dept = m.getDept();
		
		HttpSession session = req.getSession(true);
		session.setAttribute("i1",empid);
		session.setAttribute("i2",empname);
		session.setAttribute("i3",dept);

		res.sendRedirect("/FirstMVC1/result.jsp");
		
		
	}
	
}
