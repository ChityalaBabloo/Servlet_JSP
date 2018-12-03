package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		//reading parameter from login.jsp file
		String username = request.getParameter("user");
		String password = request.getParameter("pwd");
		
		//Once u read credentials from login.jsp create http session
		HttpSession hs = request.getSession();
		hs.setAttribute("uname", username);
		
		//cookies
		Cookie c1 = new Cookie("uname", username);
		Cookie c2 = new Cookie("pass", password);
		response.addCookie(c1);
		response.addCookie(c2);
		
		//defining in web.xml parameters. ServletComntext is a interface
		ServletContext sc = getServletContext();
		
		try {
			Class.forName(sc.getInitParameter("driver_class"));
			String url = sc.getInitParameter("url");
			String user = sc.getInitParameter("user");
			String pass = sc.getInitParameter("password");
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("dbconnected");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//servletConfig
		ServletConfig s = getServletConfig();
		
		if(username.equals(s.getInitParameter("lusername")) && password.equals(s.getInitParameter("lpassword"))) {
			//RequestDispatcher rd = request.getRequestDispatcher("https://www.google.co.in");
			//rd.include(request, response);
			response.sendRedirect("welcome.jsp");
		}
		else {
			out.println("<b style='color:red'>You didn't registered. PLease reister now !</b>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}
	}

}
