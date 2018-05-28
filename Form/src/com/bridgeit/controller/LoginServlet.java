package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.Dao.DataBaseConnection;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseConnection con=new DataBaseConnection();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String pass=request.getParameter("passwd");
		boolean flag=con.Retrive(name, pass);
		if(flag==true) {
			HttpSession session=request.getSession();
			session.setAttribute("userData",name);
			Cookie cookie=new Cookie("UserName",name);
			response.addCookie(cookie);
			//request.getRequestDispatcher("WelcomeUser").forward(request, response);
			response.sendRedirect("WelcomeUser");
		}else {
			out.print("<html><body><h3>Sorry invalide userName and Password</h3></body></html>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
			
		}
	}

}
