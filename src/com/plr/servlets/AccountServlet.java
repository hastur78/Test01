package com.plr.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import javax.servlet.AsyncContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Antonio Vivalda
 * 10 ago 2016
 * Copyright (c)2009 Decisyon S.r.l.
 */

@WebServlet(asyncSupported = true, urlPatterns = {"/accoufnt", "/accountServlet"}, initParams = {@WebInitParam(name = "type", value = "checking2")})
public class AccountServlet extends HttpServlet {
	
	private String par = "";
	
	/**
	 * TODO Comment for method "init" must be completed
	 * @author  Antonio Vivalda
	 * @param config
	 * @throws ServletException
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		par = config.getInitParameter("type");
		super.init();
	}
	
	/**
	 * TODO Comment for method "doGet" must be completed
	 * @author  Antonio Vivalda
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//		AsyncContext async = req.startAsync();
		//		
		//		async.addListener(new AsyncListener() {
		//			
		//			@Override
		//			public void onTimeout(AsyncEvent arg0) throws IOException {
		//				// TO_DON Method "onTimeout" in Class "Type1470857200812" must be completed 
		//				
		//			}
		//			
		//			@Override
		//			public void onStartAsync(AsyncEvent arg0) throws IOException {
		//				// TO_DON Method "onStartAsync" in Class "Type1470857200812" must be completed 
		//				
		//			}
		//			
		//			@Override
		//			public void onError(AsyncEvent arg0) throws IOException {
		//				// TO_DON Method "onError" in Class "Type1470857200812" must be completed 
		//				
		//			}
		//			
		//			@Override
		//			public void onComplete(AsyncEvent arg0) throws IOException {
		//				// TO_DON Method "onComplete" in Class "Type1470857200812" must be completed 
		//				System.out.println("ciao3");
		//				//out.println("</head></body><h1>d66" + par + "</h1>");
		//			}
		//		});
		try {
			PrintWriter out = resp.getWriter();
			out.println("<html><head>");
			out.println("<title>MyServlet</title>");
			out.println("</head></body><h1>d66" + par + System.currentTimeMillis() + "</h1>");
			out.println("</body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ciao4");
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
		//executor.execute(new MyAsincService(async));
	}
	
	class MyAsincService implements Runnable {
		AsyncContext ac;
		
		public MyAsincService(AsyncContext ac) {
			this.ac = ac;
		}
		
		public void run() {
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("ciao2");
			ac.complete();
		}
	}
}
