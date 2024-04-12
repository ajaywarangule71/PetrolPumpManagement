package petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateFuelController
 */
@WebServlet("/updfuel")
public class UpdateFuelController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int typeid=Integer.parseInt(request.getParameter("typeid"));
		String fuelname=request.getParameter("fname");
		RequestDispatcher r=request.getRequestDispatcher("AdminDashbord.jsp");
		r.include(request, response);
		out.println("<div class='col py-3'>");
		out.println("<form class='formarea' name='frm' action='finalfuelupdate' method='POST'>");
		out.println("<input type='hidden' name='typeid' value='"+typeid+"' class='control'/><br/><br/>");
		out.println("<input type='text' name='fname' value='"+fuelname+"'class='control'/><br/><br/>");
		out.println("<input type='submit' name's' value='Update Fuel Type' class='control'/>");
		out.println("</div></div></div>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
