package com.coursecube.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("*HelloServlet class service() Started");
		Writer out = res.getWriter();
		out.write("<h1>Verify the Server console");
		System.out.println("*HelloServlet class service() Completed");
	}
}
