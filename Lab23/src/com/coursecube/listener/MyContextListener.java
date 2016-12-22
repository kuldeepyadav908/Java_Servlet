package com.coursecube.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener{
	
	public void contextDestroyed(ServletContextEvent event) {
	
		System.out.println("**contextDestroyed");
		
	}
	
	public void contextInitialized(ServletContextEvent event) {
		
		System.out.println("**contextInitialized");
		ServletContext ctx = event.getServletContext();
		ctx.setAttribute("TV", 0);
		ctx.setAttribute("TA", 0);
	}

}
