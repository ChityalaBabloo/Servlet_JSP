package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");//setting the content type of response as text/html
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='mediumseagreen'>");
		out.println("<h1>DemoServlet</h1>");
		out.println("<p>This is my DemoServlet App</p>");
		out.println("</body></html>");
	}

}
