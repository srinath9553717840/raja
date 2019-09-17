package com.nit.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
   	int n1=Integer.parseInt(req.getParameter("n1"));
   	int n2=Integer.parseInt(req.getParameter("n2"));
   	
	PrintWriter pw=res.getWriter();
	pw.println("<body bgcolor='gray'>"
			+ "<h3> Sum ::"+(n1+n2)+"</h3>"
			+ "</body>");
	
	}

}
