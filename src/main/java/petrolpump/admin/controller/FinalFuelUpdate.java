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
 * Servlet implementation class FinalFuelUpdate
 */
@WebServlet("/finalfuelupdate")
public class FinalFuelUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			int typeid=Integer.parseInt(request.getParameter("typeid"));
			String fuelname=request.getParameter("fname");
			FuelTypeModel model= new FuelTypeModel();
			model.setId(typeid);
			model.setName(fuelname);
			FuelService fService=new FuelTypeServiceImpl();
			boolean b=fService.isUpdateFuel(model);
			if(b) {
				RequestDispatcher r=request.getRequestDispatcher("ViewFuel.jsp");
				r.forward(request, response);
			}else {
				out.println("<h1>Fuel Data Not Update</h1>");
			}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
