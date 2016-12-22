package com.coursecube.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd1 = req.getRequestDispatcher("header.html");
		rd1.include(req, res);
		
		RequestDispatcher rd2 = req.getRequestDispatcher("home.html");
		rd2.include(req, res);
		
		RequestDispatcher rd3 = req.getRequestDispatcher("footer.html");
		rd3.include(req, res);
	}
}
