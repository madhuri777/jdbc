import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class First {

	ServletConfig config=null;
	public void init(ServletConfig config) {
		this.config=config;
		System.out.println("Initial state");
	}
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello simple servlet</b>");  
		out.print("</body></html>");  
	}
	public void destroy() {
		System.out.println("distroy method");
	}
	public String getServletInfo(){return "copyright 2007-1010";}  

}
