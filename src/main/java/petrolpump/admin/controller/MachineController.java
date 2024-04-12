package petrolpump.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pertolpump.admin.model.MachineModel;
import petrolpump.admin.service.MachineService;
import petrolpump.admin.service.MachineServiceImpl;

@WebServlet("/newmachine")
public class MachineController extends HttpServlet {

	MachineService machineService = new MachineServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String machineCode = request.getParameter("machineCode");
		String ftypeId[] = request.getParameterValues("ftype");
		String capArray[] = request.getParameterValues("capacity");
		MachineModel model = new MachineModel();
		model.setMachinecode(machineCode);
		boolean flag = false;
		
				boolean b = machineService.isAddNewMachine(model,ftypeId,capArray);
				if (b) {
					out.println("<h1>Machine added successfully.....</h1>");
			}else {
			out.println("<h1>Machine not added successfully.....</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
