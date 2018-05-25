package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Dao.DataBaseConnection;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseConnection con=new DataBaseConnection();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("welcome in servlet");
		String name=request.getParameter("username");
		out.print(" name "+name);
		String email=request.getParameter("emails");
		out.print(" name "+email);
		String pass=request.getParameter("password");
		out.print(" name "+pass);
		String DOB=request.getParameter("bdyDate");
		out.print(" name "+DOB);
		con.insert(name, email, pass, DOB);
	}

}
