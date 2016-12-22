package com.coursecube.servlet;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ShowCartServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession sess = req.getSession(false);
		if(sess == null){
			req.setAttribute("MSG", "Session is Destroyed");
			RequestDispatcher rd = req.getRequestDispatcher("showbook.jsp");
			rd.forward(req, res);
		}else {
			Enumeration<String> enms=sess.getAttributeNames();
			List<String> selectedlist = Collections.list(enms);
			selectedlist.remove("BOOKS");
			if(selectedlist.size()==0){
				req.setAttribute("MSG", "No books selected");
			}else {
				req.setAttribute("CART", selectedlist);
			}
			RequestDispatcher rd = req.getRequestDispatcher("showcart.jsp");
			rd.forward(req, res);
		}
	}

}

