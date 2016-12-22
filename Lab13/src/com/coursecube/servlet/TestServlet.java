package com.coursecube.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession sess = req.getSession();
		Writer out = res.getWriter();
		out.write("<h1><br/>ID: "+sess.getId());
		out.write("<br/>isNew: "+sess.isNew());
		
	}

}
