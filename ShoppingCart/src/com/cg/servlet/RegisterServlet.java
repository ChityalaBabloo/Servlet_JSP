package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.servlet.dao.UserDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//reading parameter from login.jsp file
		String username = request.getParameter("user");
		String password = request.getParameter("pwd");
		String mail = request.getParameter("mail");
		String mobile = request.getParameter("phone");
		
		UserDao dao = new UserDao();
		int f = dao.add(username, password, mail, mobile);
		if(f>0) {
			//response.sendRedirect("login.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");//RequestDispatch Object creation
			rd.forward(request, response);
		}
		else {
			//response.sendRedirect("register.jsp?emsg="+"something went wrong");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp?emsg=something wentfghfghrfg wrong");
			rd.include(request, response);
		}
		
		/*out.println("<html>");
		out.println("<body bgcolor='mediumseagreen'>");
		out.println("<p>Welcome Mr. "+username+". Your password is: "+password+"</p>");
		out.println("<p>Welcome Mr. "+mail+". Your password is: "+mobile+"</p>");
		out.println("</body>");
		out.println("</html>");*/
	}
}
