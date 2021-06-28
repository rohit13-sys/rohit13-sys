package com.pheonix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String myUrl =response.encodeURL("products") ;
		String userName = request.getParameter("un");
		HttpSession session = request.getSession();

		// Session TimeOut
		session.setMaxInactiveInterval(3);

		// setting username in session
		session.setAttribute("userName", userName);

		// setting session_id in session
		session.setAttribute("sessionId", session.getId());

		out.println("<h1>Welcome " + userName + "&#128512;</h1>");
		System.out.println(">>>>>>>>>>>>SessionId: " + session.getId());
		out.println("<br>Session_TimeOut: " + session.getMaxInactiveInterval() + "s");
		out.println("<br><br>For shopping: <a href=" + myUrl + ">Products</a>");
	}

}
