package Servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.visiting_details;
import Service.visiting_services;


@WebServlet("/checkavailability")
public class checkavailability extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html"); 
		
		String name = request.getParameter("vipname");
		String nic = request.getParameter("Nic");
		boolean isTrue;
		
		isTrue = visiting_services.validate(name, nic);
		
		if(isTrue == true){
			List<visiting_details> visiteDetails = visiting_services.getvisite(name);
			request.setAttribute("visiteDetails", visiteDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("visiteDetails.jsp");
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Customer name or selection or Number is incorrect');");
			out.println("location='checking.jsp'");
			out.println("</script>");
		}
	}
}
