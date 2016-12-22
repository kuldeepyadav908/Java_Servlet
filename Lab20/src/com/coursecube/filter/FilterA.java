package com.coursecube.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterA implements Filter{
	public void destroy() {
		System.out.println("FilterA -> destroy()");
	}
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterA -> doFilter() Started");
		chain.doFilter(req, res);
		System.out.println("FilterA -> doFilter() Completed");
	}
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("FilterA -> init()");
		
	}

}
