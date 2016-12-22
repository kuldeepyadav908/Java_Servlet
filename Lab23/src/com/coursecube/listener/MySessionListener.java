package com.coursecube.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener{
	
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession sess = event.getSession();
		ServletContext ctx = sess.getServletContext();
		int tv = (Integer)ctx.getAttribute("TV");
		tv++;
		ctx.setAttribute("TV", tv);
		int ta= (Integer)ctx.getAttribute("TA");
		ta++;
		ctx.setAttribute("TA", ta);
		
	}

	
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession sess = event.getSession();
		ServletContext ctx = sess.getServletContext();
		int ta= (Integer)ctx.getAttribute("TA");
		ta--;
		ctx.setAttribute("TA", ta);
		
	}
	

}
