package com.coursecube.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("*TestServlet -> service()");
		System.out.println("Accessing Session Object");
		HttpSession sess = req.getSession();
		String eml = req.getParameter("email");
		ServletContext ctx = getServletContext();
		System.out.println("Storing Attribute in Context");
		ctx.setAttribute("email", eml);
		System.out.println("Replacing Attribute in Context");
		ctx.setAttribute("email", "nivas@jlc.com");
		System.out.println("Removing Attribute in Context");
		ctx.removeAttribute("email");
		System.out.println("Invalidating Session object");
		sess.invalidate();
		Writer out = res.getWriter();
		out.write("<h1>Verify the Server console");
	}
}
