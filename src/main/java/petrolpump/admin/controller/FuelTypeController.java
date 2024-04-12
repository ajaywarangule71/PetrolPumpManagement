package petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pertolpump.admin.model.FuelTypeModel;
import petrolpump.admin.service.FuelService;
import petrolpump.admin.service.FuelTypeServiceImpl;

/**
 * Servlet implementation class FuelTypeController
 */
@WebServlet("/fueltype")
public class FuelTypeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fuelType=request.getParameter("type");
		FuelTypeModel model = new FuelTypeModel();
		model.setName(fuelType);
		FuelService fService =new FuelTypeServiceImpl();
		boolean b=fService.isAddFuelModel(model);
		if(b) {
			RequestDispatcher r=request.getRequestDispatcher("AdminDashbord.jsp");
			r.include(request, response);
			out.println("<center>Fuel Type added Successfully......</center>");
		}
		else {
			RequestDispatcher r=request.getRequestDispatcher("AdminDashbord.jsp");
			r.include(request, response);
			out.println("<center>Some Problem is there......</center>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
