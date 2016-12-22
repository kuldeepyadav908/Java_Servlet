package com.coursecube.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyContextAttributeListener implements ServletContextAttributeListener{
	public void MyContextAttributeListener(){
		System.out.println("**MyContextAttributeListener() Def cons");
	}

	
	public void attributeAdded(ServletContextAttributeEvent event) {
		String nm = event.getName();
		String val = event.getValue().toString();
		System.out.println("**attributeAdded(): "+nm+"\t"+val);
		
	}

	
	public void attributeRemoved(ServletContextAttributeEvent event) {
		String nm = event.getName();
		String val = event.getValue().toString();
		System.out.println("**attributeRemoved(): "+nm+"\t"+val);
		
	}

	
	public void attributeReplaced(ServletContextAttributeEvent event) {
		String nm = event.getName();
		String val = event.getValue().toString();
		System.out.println("**attributeReplaced(): "+nm+"\t"+val);
		
	}
	

}
