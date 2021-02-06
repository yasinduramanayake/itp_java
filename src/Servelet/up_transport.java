package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.TransportService;

import Model.Transport_details;


/**
 * Servlet implementation class up_transport
 */
@WebServlet("/up_transport")
public class up_transport extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String name= request.getParameter("name");
		Double distance= Double.parseDouble(request.getParameter("Distance"));
		String Location= request.getParameter("location");
		Double size= Double.parseDouble(request.getParameter("size"));
		String payment= request.getParameter("payment");
		
		Transport_details u = new Transport_details();
	
		u.setName(name);
		u.setDistance(distance);
		u.setLocation(Location);
		u.setStreetsize(size);
		u.setPaymentMethod(payment);
		   
		TransportService tra = new TransportService();
		tra.updateTransport(u);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/display.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
