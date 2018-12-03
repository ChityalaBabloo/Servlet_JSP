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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		UserDao dao = new UserDao();
		
		//reading parameter from login.jsp file
		String username = request.getParameter("user");
		String password = request.getParameter("pwd");
		boolean result = dao.validateUser(username,password);
		
		if(result) {
			response.sendRedirect("home.jsp");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp?message=Username/Password is Invalid !!");
			rd.include(request, response);
		}
	}

}
