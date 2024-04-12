package petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pertolpump.admin.model.MachineModel;
import petrolpump.admin.service.MachineService;
import petrolpump.admin.service.MachineServiceImpl;

/**
 * Servlet implementation class UpdateMachineController
 */
@WebServlet("/updmachine")
public class UpdateMachineController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int mid=Integer.parseInt(request.getParameter("mid"));
		String machineCode=request.getParameter("mcode");
		RequestDispatcher r=request.getRequestDispatcher("AdminDashbord.jsp");
		r.include(request, response);
		out.println("<div class='col py-3'>");
		out.println("<form class='formarea' name='frm' action='finalmachineupdate' method='POST'>");
		out.println("<input type='hidden' name='mid' value='"+mid+"' class='control'/><br/><br/>");
		out.println("<input type='text' name='mcode' value='"+machineCode+"'class='control'/><br/><br/>");
		out.println("<input type='submit' name's' value='Update Machine Code' class='control'/>");
		out.println("</div></div></div>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
