package com.coursecube.servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SearchBookServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String cat = req.getParameter("category");
		if(cat!=null && cat.equals("JAVA")){
			ArrayList<String> blist = new ArrayList<String>();
			blist.add("Java");
			blist.add("JDBC");
			blist.add("Servlet");
			blist.add("JSP");
			blist.add("EJB");
			blist.add("RMI");
			HttpSession sess = req.getSession();
			sess.setAttribute("BOOKS", blist);
		}else {
			req.setAttribute("MSG", "No Books found with category "+cat);
		}
		RequestDispatcher rd = req.getRequestDispatcher("showbook.jsp");
		rd.forward(req, res);
	}

}



