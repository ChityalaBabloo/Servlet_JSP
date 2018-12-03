package com.cp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cp.servlet.dao.CapStoreDao;

/**
 * Servlet implementation class AddCartServlet
 */
@WebServlet("/addCart")
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String pid = request.getParameter("id");
		
		CapStoreDao dao = new CapStoreDao();
		int result = dao.addCart(pid);
		if(result>0) {
			RequestDispatcher rd = request.getRequestDispatcher("add_cart.jsp?msg=Product Successfully added to Cart !");
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("second.jsp?id="+pid+"&& msg=Something Wrong...Try Again !!");
			rd.include(request, response);
		}
	}

}
