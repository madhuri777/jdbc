package com.servletcookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProfilePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		//out.println("this is profile request and response "+request+" "+response);
		Cookie ck[]=request.getCookies();
		if(ck!=null) {
			String name=ck[0].getValue();
			if(name!=null&&!name.equals("")) {
				out.print("Welcome to Profile Page");
				out.println("<br>Welcome "+name);
			}
			
		}else {
			out.println("Please login first <br>");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
		request.getRequestDispatcher("link.html").include(request, response);
		out.close();
	}

}
