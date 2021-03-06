package com.coursecube.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="logoutServlet", urlPatterns="/logout.jlc")
public class LogoutServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession sess = req.getSession(false);
		if(sess != null){
			sess.invalidate();
		}
		RequestDispatcher rd = req.getRequestDispatcher("logout.jsp");
		rd.forward(req, res);
	}
}
