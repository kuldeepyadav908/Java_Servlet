package com.coursecube.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LoginServlet extends HttpServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("**service to TestServlet");
		
		//Collecting Client Data
		String unm = req.getParameter("username");
		String pwd = req.getParameter("password");
		Writer out = res.getWriter();
		out.write("<h1>Hi, Welcome to JLC");
		String page = "";
		
		//Verifying Client Data
		if(unm.equals(pwd)){
			page = "/WEB-INF/home.html";
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}else{
			page = "/WEB-INF/error.html";
			RequestDispatcher rd = req.getRequestDispatcher(page);
			rd.forward(req, res);
		}
		
		//Prepairing The Response
		out.write("<h1>Again, Welcome to JLC");
		System.out.println("**Service completed - Last Statement**");
	}
}
