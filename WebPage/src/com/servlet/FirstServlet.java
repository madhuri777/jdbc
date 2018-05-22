package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	ServletConfig configs=null;
	public void init(ServletConfig configs) {
		this.configs=configs;
		System.out.println("Initial state ");
	}
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<body>Welcome to servlet</body>");
		out.print("</html>");
		
	}
	public void distroy() {
		System.out.println("destroyed method called");
	}
	public String getServletInfo(){return "copyright 2007-1010";}  
}
