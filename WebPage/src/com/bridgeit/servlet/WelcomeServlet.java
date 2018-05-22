package com.bridgeit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.deo.ConnectionDemo;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConnectionDemo democn=new ConnectionDemo();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("userName");
		String email=request.getParameter("email");
		democn.insert(name, email);
		out.println("welcome   "+name+"\t"+" ur email_id is "+email);
		democn.Record();
	}

}
