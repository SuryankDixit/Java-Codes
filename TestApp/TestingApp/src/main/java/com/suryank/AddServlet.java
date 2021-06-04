package com.suryank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	// for doing any task i have to use method which is service
	// service method belongs to servlet life cycle
	
	// instead of service method , we can use get and post method
	// internally request will go to service method and that function will call get and post method
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int k=num1+num2;
		
		req.setAttribute("k", k);
		
		// request dispatcher
		// calling square servlet from add servlet with req res object
		// concept of session management ?
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
	}
}
