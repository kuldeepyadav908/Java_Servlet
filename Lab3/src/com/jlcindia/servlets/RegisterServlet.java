package com.jlcindia.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
System.out.println("service()");
//1.Collect the data
String fn=req.getParameter("fname");
String em=req.getParameter("email");
String ph=req.getParameter("phone");
String ge=req.getParameter("gender");
String ti=req.getParameter("timings");
String co=req.getParameter("course");
String cous[]=req.getParameterValues("course");
String re=req.getParameter("remarks");
//2.Process the data(store in db)
String msg="Your Enquiry Has been added successfully";
System.out.println("Full name:"+fn);
System.out.println("Email ID"+em);
System.out.println("Phone No:"+ph);
System.out.println("Gender:"+ge);
System.out.println("Timings:"+ti);
System.out.println("Course:"+co);
System.out.println("All course");
if(cous!=null)
	for(String c:cous){
		System.out.println(c);
	}
System.out.println("Remarks:"+re);
//3.Send response
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<h1>Java Learning Center</h1>");
out.println("<h1>"+msg+"</h1>");
out.println("<h1>Full name:"+fn);
out.println("<h1>Email ID:"+em);
out.println("<h1>Phone NO:"+ph);
out.println("<h1>Gender:"+ge);
out.println("<h1>Timings:"+ti);
out.println("<h1>Course:"+co);
out.println("<h1>All courses");
if(cous!=null)
	for(String c:cous){
		out.println("<br/>"+c);
		
	}
out.println("<h1>Remarks:"+re);


	
}
}
