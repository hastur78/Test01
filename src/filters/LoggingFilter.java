package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * TODO Comment for class "LoggingFilter" must be completed
 * @author Antonio Vivalda
 * 10 ago 2016
 * Copyright (c)2009 Decisyon S.r.l.
 */
@WebFilter(asyncSupported = true, urlPatterns = "/*")
public class LoggingFilter implements Filter {

	/**
	 * TODO Comment for method "destroy" must be completed
	 * @author  Antonio Vivalda
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TO_DON Method "destroy" in Class "Filter" must be completed 
		
	}
	
	/**
	 * TODO Comment for method "doFilter" must be completed
	 * @author  Antonio Vivalda
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @throws IOException
	 * @throws ServletException
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		System.out.println("ciao");
		arg2.doFilter(arg0, arg1);
	}
	
	/**
	 * TODO Comment for method "init" must be completed
	 * @author  Antonio Vivalda
	 * @param arg0
	 * @throws ServletException
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TO_DON Method "init" in Class "Filter" must be completed 
		
	}
	
}
