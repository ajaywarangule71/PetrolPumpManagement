package petrolpump.admin.controller;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import petrolpump.admin.service.MachineService;
import petrolpump.admin.service.MachineServiceImpl;


@WebServlet("/del")
public class DeleteControllerService extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");	
     PrintWriter out=response.getWriter();
     int mid=Integer.parseInt(request.getParameter("machineid"));
    MachineService mService= new MachineServiceImpl();
    boolean b=mService.isDeleteMachineById(mid);
    if(b) {
    	RequestDispatcher r=request.getRequestDispatcher("ViewMachine.jsp");
    	r.forward(request, response);
    }
    else {
    	out.println("<h1>Some problem is there</h1>");
    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
