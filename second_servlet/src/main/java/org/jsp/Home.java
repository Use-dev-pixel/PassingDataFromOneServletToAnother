package org.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Home extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		HttpSession session=req.getSession();
		
		String name=(String)session.getAttribute("name");
		out.println("<h1>Hi......"+name+"</h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='profile' method='post'>");
		out.println("<button>Profile</button>");
		out.println("</form>");
		out.println("<form action='logout' method='post'>");
		out.println("<button>Logout</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
