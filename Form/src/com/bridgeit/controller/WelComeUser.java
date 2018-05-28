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


public class WelComeUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		//out.println("hello "+user);
//		Cookie cookie=new Cookie("UserName",user);
//		response.addCookie(cookie);
		HttpSession sessions=request.getSession();
		String name=(String) sessions.getAttribute("userData");
		out.println("hello "+name);
		request.getRequestDispatcher("LogOut.jsp").include(request, response);
	}

}
