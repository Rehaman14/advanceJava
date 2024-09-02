package Demo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/dis")
public class rehaman implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String uname=arg0.getParameter("uname");
		String  ufrist=arg0.getParameter("ufrist");
		String ulast=arg0.getParameter("ulast");
		String mid=arg0.getParameter("mid");
		String pnumber=arg0.getParameter("pnumber");
		
		PrintWriter pw = arg1.getWriter();
		arg1.setContentType("text/html");
		
		pw.println("Servlet running....");
		
	}

}
