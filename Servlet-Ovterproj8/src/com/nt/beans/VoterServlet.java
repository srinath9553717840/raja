package com.nt.beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet{
	
	public void dopost(HttpServletResponse res,HttpServletRequest req)throws ServletException,IOException {

		
		res.setContentType("text/html");
		
	      PrintWriter pw=res.getWriter();
		
	String	name=req.getParameter("name");
		
		int  age = Integer.parseInt(req.getParameter("age"));
		 
		 
		if (age>=18) {
			
			pw.println("<h1 style='color:green'>"+name+"you are Eligible for Vote</h1>");
		}
			
		else {
			
			pw.println("<h1 style='color:red'>"+name+"you are not Eligible for Vote</h1>");
		}
		
		//pw.println("<a href='input.html'>click</a>");
		
		pw.close();
			
		}
		
}
