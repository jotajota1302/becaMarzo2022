package edu.es.eoi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MiPrimerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		UserRepository repository=new UserRepository();
		repository.saveUser();
		
		String name=req.getParameter("name");
	    String pw=req.getParameter("password");
		
		if(name.equals("JJ")) {
			resp.getWriter().append("forbidden");
		}else {
			resp.sendRedirect("index.jsp");
		}
	}
	
	

}
