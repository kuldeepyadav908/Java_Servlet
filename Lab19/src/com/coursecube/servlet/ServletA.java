package com.coursecube.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("**ServletA service() Started");
		RequestDispatcher rd = req.getRequestDispatcher("b.jlc");
		rd.forward(req, res);
		System.out.println("**ServletA service() Completed");
	}

}
