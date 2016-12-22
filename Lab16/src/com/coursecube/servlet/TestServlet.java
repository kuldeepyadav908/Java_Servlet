package com.coursecube.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out = res.getWriter();
		HttpSession hs = req.getSession();
		out.println("<h1> Session: "+hs.isNew());
		Cookie cks[] = req.getCookies();
		out.println("<h1>"+cks);
		boolean jsidflag = false;
		boolean jlcflag = false;
		if(cks == null || cks.length==0){
			out.println("<h1> OOOOO No Coookiesssss</h1>");
		}else{
			for(Cookie ck:cks){
				String cn = ck.getName();
				String cv = ck.getValue();
				out.println("<h1>"+cn+"-----"+cv+"</h1>");
				if(cn.equals("JSESSIONID")){
					jsidflag = true;
				}
				if(cn.equals("JLC")){
					jlcflag = true;
					ck.setMaxAge(0);
					res.addCookie(ck);
				}
			}
		}
		if(jsidflag){
			out.println("<h1> JSESSIONID Cookie is Found.....");
		}else {
			out.println("<h1> JSESSIONID Cookie is Not Found.....");
		}
		if(jlcflag){
			out.println("<h1> JLC Cookie is Found.....");
		}else{
			out.println("<h1> JLC Cookie is Not Found.....");
		}
		Cookie c1 = new Cookie("JLC", "Welcome to JLC");
		res.addCookie(c1);
		Cookie c2 = new Cookie("EM", "sri@jlc");
		res.addCookie(c1);
		Cookie c3 = new Cookie("PH", "999999");
		res.addCookie(c1);
	}

}
