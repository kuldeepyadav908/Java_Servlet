package com.coursecube.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class RemoveFromCartServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession sess = req.getSession(false);
		if(sess == null){
			req.setAttribute("MSG", "Session is Destroyed");
		}else {
			String bnm = req.getParameter("bname");
			sess.removeAttribute(bnm);
		}
		RequestDispatcher rd = req.getRequestDispatcher("showcart.jlc");
		rd.forward(req, res);
	}

}
