package controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/hello")

public class HelloWorld extends HttpServlet {
   public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {


	res.setContentType("text/html");
	PrintWriter out = res.getWriter();

	out.println("<HTML>");
	out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("<H1>Hello World</H1>");
	out.println("Today is: " + (new java.util.Date().toString()) );
	out.println("</BODY></HTML>");
   } // doGet

} // HelloWorld