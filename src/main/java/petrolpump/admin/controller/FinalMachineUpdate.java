package petrolpump.admin.controller;

import java.io.*;

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
 * Servlet implementation class FinalMachineUpdate
 */
@WebServlet("/finalmachineupdate")
public class FinalMachineUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			int mid=Integer.parseInt(request.getParameter("mid"));
			String machineCode=request.getParameter("mcode");
			MachineModel model= new MachineModel();
			model.setId(mid);
			model.setMachinecode(machineCode);
			MachineService mService=new MachineServiceImpl();
			boolean b=mService.isUpdateMAchine(model);
			if(b) {
				RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
				r.forward(request, response);
			}else {
				out.println("<h1>Machine Data Not Update</h1>");
			}
		}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
