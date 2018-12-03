package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.servlet.dao.UserDao;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 
		String pidd=request.getParameter("pid");
		String price=request.getParameter("price");
		 
		UserDao dao=new UserDao();
		int n=dao.updatePrice(pidd,price);
		if(n>0) {
		out.println("<body>Successfully Price updated..........</body></html>");
		response.sendRedirect("home.jsp");
		}
	}

}
