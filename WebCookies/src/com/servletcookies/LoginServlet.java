package com.servletcookies;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("username");
		//out.write("hii this is "+name);
		if(name!=null&&!name.equals("")) {
			Cookie ck=new Cookie("UserName",name);
			response.addCookie(ck);
			
		}else {
			
			request.getRequestDispatcher("Login.html").include(request, response);
			out.println("Sorry u have not enter the user name"+" <br>");
			//out.print("this is request of first page  "+request.toString()+" and response "+response.toString());
		}
		
		request.getRequestDispatcher("link.html").include(request, response);
	}

}
