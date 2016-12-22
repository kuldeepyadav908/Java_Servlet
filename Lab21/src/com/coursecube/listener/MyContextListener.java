package com.coursecube.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener{
	public MyContextListener() {
		System.out.println("MyContextListener() Def cons");
	}
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext ctx = event.getServletContext();
		System.out.println("contextDestroyed: "+ctx);
		
	}
	
	public void contextInitialized(ServletContextEvent event) {
		ServletContext ctx = event.getServletContext();
		System.out.println("contextInitialized: "+ctx);
		
	}

}
