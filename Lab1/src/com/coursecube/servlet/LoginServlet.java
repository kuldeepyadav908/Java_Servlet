package com.coursecube.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LoginServlet extends HttpServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//Collecting Client Data
		String unm = req.getParameter("username");
		String pwd = req.getParameter("password");
		String msg = "";
		
		//Verifying Client Data
		if(unm.equals(pwd)){
			msg = "<h1>Login Success...</br> Welcome to JLC Home Page";
		}else{
			msg = "<h1>Login Failed..</br> Invalid Username or Password";
		}
		
		//Prepairing The Response
		Writer out = res.getWriter();
		out.write(msg);
	}
}
