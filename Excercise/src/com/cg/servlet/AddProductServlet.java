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
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//reading parameter from register.jsp file
		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String pmodel = request.getParameter("pmodel");
		String price = request.getParameter("price");
		
		UserDao dao = new UserDao();
		int products = dao.addProduct(pid,pname,pmodel,price);
		if(products>0) {
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp?message=Product Successfully Added..!!");
			rd.include(request, response);
		}
		else {
			//response.sendRedirect("register.jsp?emsg="+"something went wrong");
			RequestDispatcher rd = request.getRequestDispatcher("add_product.jsp?message=Product not Added..Try again!!");
			rd.include(request, response);
		}
	}

}
