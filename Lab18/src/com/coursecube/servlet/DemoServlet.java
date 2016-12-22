package com.coursecube.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(
		//loadOnStartup=1,
		name="demoServlet",
		urlPatterns = {"/demo.jlc"},
		initParams={
				@WebInitParam(name="city",value="Chennai")
		}
	)
public class DemoServlet extends HttpServlet{
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("**DemoServlet-init()--start**");
		String ci = sc.getInitParameter("city");
		System.out.println(ci);
		System.out.println("**DemoServlet-init()--end**");

	}
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		System.out.println("<h1>**DemoServlet-service()--start**");
		String nm = req.getParameter("name");
		String em = req.getParameter("email");
		String ip = req.getRemoteAddr();
		String msg = "<h1>Hello !"+nm+"<br>";
		msg = msg + "Your Email id is: "+em+"<br>";
		msg = msg + "You are sending the requesting from IP Address: "+ip;
		req.setAttribute("MSG", msg);
		PrintWriter out = res.getWriter();
		out.println(msg);
		System.out.println("<h1>**DemoServlet-service()--end**");
	}
	public void destroy() {
		System.out.println("DemoServlet-destroy()");
		
	}
}
