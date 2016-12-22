package com.coursecube.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class DemoFilter implements Filter{
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("**DemoFilter-init()--start**");
		String ci = fc.getInitParameter("city");
		System.out.println(ci);
		System.out.println("**DemoFilter-init()--end**");
		
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)throws IOException, ServletException {
		System.out.println("**DemoFilter-doFilter()--before**");
		String nm = req.getParameter("name");
		String em = req.getParameter("email");
		String ip = req.getRemoteAddr();
		System.out.println(nm);
		System.out.println(em);
		System.out.println(ip);
		fc.doFilter(req, res);
		System.out.println("**DemoFilter-doFilter()--after**");
		Object obj = req.getAttribute("MSG");
		System.out.println(obj);
		String msg = obj.toString();
		System.out.println(msg);
	}
	public void destroy() {
		System.out.println("**DemoFilter-destroy()**");
		
	}
}
