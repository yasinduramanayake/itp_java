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


@WebServlet("/deleteVisite")
public class deleteVisite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int Visite_Id = Integer.parseInt(request.getParameter("visiteId"));
	
		visiting_details delvisit = new visiting_details();
		
		delvisit.setVistiteId(Visite_Id);
		
		visiting_services visitdeleted = new visiting_services();
		
		
		visitdeleted.deleteVisite(delvisit);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Visiting_display.jsp") ;
		dispatcher.forward(request, response);
		
	}

}
