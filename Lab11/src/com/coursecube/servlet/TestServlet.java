package com.coursecube.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
	static int count = 0;
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		count++;
		System.out.println("---Service---: "+count);
		Writer out = res.getWriter();
		Date dt = new Date();
		out.write("<h1>"+dt);
		if(count<=10){
			res.setHeader("Refresh", "1");
		}else{
			res.setHeader("Refresh","1;URL=http://jlcindia.com");
		}
	}
}
