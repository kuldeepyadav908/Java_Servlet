package com.coursecube.servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Request Parameters
		String un = req.getParameter("uname");
		String pw = req.getParameter("password");
		
		//Display Request Parameter
		PrintWriter out = res.getWriter();
		out.append("<h1>Request Parameter");
		out.append("<h1>Username: "+un);
		out.println("<br/>Password: "+pw);
		out.println("<hr/>");
		//Display Request Headers
		out.append("<h1>Request Headers");
		Enumeration e = req.getHeaderNames();
		while (e.hasMoreElements()) {
			String hn = e.nextElement().toString();
			String hv = req.getHeader(hn);
			out.println("<br/>"+ hn +":"+hv);
		}
		out.println("<hr/>");
		out.println("<h1>Locale info");
		
		//Locale Support By Browser
		out.println("<br/>req."+req.getLocale());
		out.println("<hr/>");
		
		//Other Information
		out.println("<br/>getMethod: "+req.getMethod());
		out.println("<br/>getRequestURI: "+req.getRequestURI());
		out.println("<br/>getRequestURL: "+req.getRequestURL());
		out.println("<br/>getProtocol: "+req.getProtocol());
		out.println("<br/>getContentLength: "+req.getContentLength());
		out.println("<br/>getContentType: "+req.getContentType());
		out.println("<br/>getRemoteAddr: "+req.getRemoteAddr());
		out.println("<br/>getRemotePort: "+req.getRemotePort());
		out.println("<br/>getRemoteHost: "+req.getRemoteHost());
		out.println("<br/>getServerPort: "+req.getServerPort());
		out.println("<br/>getServerName: "+req.getServerName());
		out.println("<br/>getQueryString: "+req.getQueryString());
		out.println("<br/>getServletPath: "+req.getServletPath());
		out.println("<br/>getContextPath: "+req.getContextPath());
		
	}
}
