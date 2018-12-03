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
 * Servlet implementation class BuyServlet
 */
@WebServlet("/Buy")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String pid = request.getParameter("id");
		String address = request.getParameter("Address");

		CapStoreDao dao = new CapStoreDao();
		int orderId = dao.insertBuy(pid,address);
		
		if(orderId>0) {
			RequestDispatcher rd = request.getRequestDispatcher("summary.jsp?orderId="+orderId);
			rd.include(request, response);
		}
	}
}
