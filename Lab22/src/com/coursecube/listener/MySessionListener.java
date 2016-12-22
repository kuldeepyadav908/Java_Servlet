package com.coursecube.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener{
	public void MySessionListener(){
		System.out.println("**MySessionListener() Def cons");
	}
	
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("**sessionCreated()");
		
	}

	
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("**sessionDestroyed()");
		
	}
	

}
