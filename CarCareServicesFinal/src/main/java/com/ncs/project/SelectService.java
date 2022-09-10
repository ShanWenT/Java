package com.ncs.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SelectService
 */
public class SelectService extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			HttpSession session = req.getSession();
			String username = session.getAttribute("username").toString();
			String carModel = req.getParameter("carModel");
			String carVH = req.getParameter("carVH");
			String service = req.getParameter("service");
			String status = "0";
		
			Model m = new Model();
			m.connect();
			m.setUsername(username);
			m.setCarModel(carModel);
			m.setCarVH(carVH);
			m.setService(service);
			m.setStatus(status);
			int x = m.insertService();
			if(x ==1)
			{
				res.sendRedirect("/CarCareServicesFinal/CustomerBookingSuccessful.jsp");
			}
			else
			{
				res.sendRedirect("/CarCareServicesFinal/CustomerSuccess.jsp");
			}
		}
	}
