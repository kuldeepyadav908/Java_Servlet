package com.coursecube.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//collect input Data
		String page = req.getParameter("page");
		//validate the input Data
		if(page==null||page.trim().length()==0){
			RequestDispatcher rd = null;
		    rd = req.getRequestDispatcher("error.html");
			rd.forward(req, res);
			return;
		}
		if(page.startsWith("www")){
			page = "http://"+page;
		}
		res.sendRedirect(page);
	}
}
