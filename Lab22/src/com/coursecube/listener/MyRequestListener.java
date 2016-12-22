package com.coursecube.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestListener implements ServletRequestListener{
	public void MyRequestListener(){
		System.out.println("**MyRequestListener() Def cons");
	}

	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("**requestDestroyed()");
		
	}

	
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("**requestInitialized()");
		
	}

	
	
}
