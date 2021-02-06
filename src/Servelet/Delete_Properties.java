package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Pricing_details;
import Service.pricing_services;

/**
 * Servlet implementation class Delete_Properties
 */
@WebServlet("/Delete_Properties")
public class Delete_Properties extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int link = Integer.parseInt(request.getParameter("link"));
		int pid= Integer.parseInt(request.getParameter("Pid"));
		
		Pricing_details D = new Pricing_details();
		
	
		D.setPid(pid);
		
		pricing_services Delete = new pricing_services();
		Delete.DeleteProperties(D);
		if(link == 1) {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HotelFurnitureProperties.jsp") ;
		
		dispatcher.forward(request, response);
		}
		else if(link ==2) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Pantey_and_kitchen.jsp") ;
			
			dispatcher.forward(request, response);
		}
		else if(link == 3) {
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WoodenDecking_and_timber_floring.jsp") ;
			
			dispatcher.forward(request, response);
		}
		else if(link == 4) {
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Office_Furniture_properties.jsp") ;
			
			dispatcher.forward(request, response);
		}
		else if(link ==5) {
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Sofasetes_properties.jsp") ;
			
			dispatcher.forward(request, response);
		}
		else if(link == 6) {
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HouseHoldFurniturePropeties.jsp") ;
			
			dispatcher.forward(request, response);
		}
		doGet(request, response);
		
	}

}
