package com.bridgeit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.deo.ConnectionDemo;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String name=request.getParameter("userName");
		String email=request.getParameter("email");
		
		//System.out.println("user name "+request.getParameter("userName"));
		PrintWriter out=response.getWriter();
		//out.print("welcome "+name);
		if(name!="") {
			
		RequestDispatcher req=request.getRequestDispatcher("/Servlet2");
		req.forward(request,response);
		}
		else {
			
			RequestDispatcher req=request.getRequestDispatcher("/index.html");
			req.include(request, response);
			out.print("Please Enter the UserName ");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
