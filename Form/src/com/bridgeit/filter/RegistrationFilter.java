package com.bridgeit.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegistrationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		
		String email=request.getParameter("emails");
		
		String pass=request.getParameter("password");
		
		String repass=request.getParameter("repasswd");
		String DOB=request.getParameter("bdyDate");
		
		if(nameValidation(name)&&emailValidation(email)&&passwdValidation(pass,repass)&&DOB!="") {
			out.print("good");
			System.out.println("u filled all  fieds");
			chain.doFilter(request, response);
		}else {
			out.println("please fill all fieds");
			System.out.println("please fill all fieds");
			HttpServletResponse httpServletResponse=(HttpServletResponse) response;
			httpServletResponse.sendRedirect("Registration.jsp");
		}
			
		}

		public boolean nameValidation(String name) {
			String pattern ="[A-Za-z]*";
			if(name.matches(pattern)&&name!="") {
				System.out.println("good u entered all character ");
				return true;
			}else {
				System.out.println("pleae enter all character in anem filed");
				return false;
			}
		}
		
		public boolean emailValidation(String email) {
			String pattern="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
			if(email!=""&&email.matches(pattern)) {
				System.out.println("good ur email id is right");
				return true;
			}else {
				System.out.println("plese enter valid emailid");
				return false;
			}
		}
		
		public boolean passwdValidation(String pass,String repass) {
			
			if(pass!=""&&repass!=""&&pass.equals(repass)) {
				System.out.println("u have enterd corect passwd ");
				return true;
			}else {
				System.out.println("plese enter non empty same length pass word ");
				return false;
			}
		}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
