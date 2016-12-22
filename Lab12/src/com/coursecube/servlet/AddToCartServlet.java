package com.coursecube.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddToCartServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession sess = req.getSession(false);
		if(sess == null){
			req.setAttribute("MSG", "Session is Destroyed");
		}else {
			String bnm = req.getParameter("bname");
			sess.setAttribute(bnm, bnm);
			req.setAttribute("ADDED",bnm+ "is added to cart");
		}
		RequestDispatcher rd = req.getRequestDispatcher("showbook.jsp");
		rd.forward(req, res);
	}

}
