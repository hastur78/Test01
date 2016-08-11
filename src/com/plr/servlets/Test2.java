package com.plr.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO Comment for class "Test2" must be completed

 * @author Antonio Vivalda
 * 10 ago 2016
 * Copyright (c)2009 Decisyon S.r.l.
 */
@WebServlet("/faccount")
public class Test2 extends HttpServlet {  
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (PrintWriter out = resp.getWriter()) {
			out.println("<html><head>");
			out.println("<title>master</title>");
			out.println("</head></body><h1>MyFirstServlet</h1>");
			out.println("</body></html>");    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
