package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.visiting_details;
import Service.visiting_services;


@WebServlet("/updeteVisiteServlet")
public class updeteVisiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int Visite_Id = Integer.parseInt(request.getParameter("visiteId"));
		String CUstomer_Name = request.getParameter("fullname");
		String NIC_Number = request.getParameter("NIC");
		String Email_number = request.getParameter("Email");
		String Mobile_Number = request.getParameter("pNum");
		String Customer_Address = request.getParameter("adres");
		String Customer_message = request.getParameter("message");
		
		visiting_details visitup = new visiting_details();
		
		
		visitup.setVistiteId(Visite_Id);
		visitup.setAddress(Customer_Address);
		visitup.setName(CUstomer_Name);
		visitup.setMessege(Customer_message);
		visitup.setEmail(Email_number);
		visitup.setNIc(NIC_Number);
		visitup.setpNum(Mobile_Number);
		
		
		visiting_services visitings = new visiting_services();
		visitings.updatevisiting(visitup);
		
		RequestDispatcher dis3 = request.getRequestDispatcher("Visiting_display.jsp");
		dis3.forward(request, response);
	}

}
