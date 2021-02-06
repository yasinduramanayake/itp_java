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
 * Servlet implementation class Pricing_properties
 */
@WebServlet("/Pricing_properties")
public class Pricing_properties extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String material= request.getParameter("mat");
		String Labours= request.getParameter("lab");
		Double Labour_cost= Double.parseDouble(request.getParameter("labcost"));
		Double material_cost= Double.parseDouble(request.getParameter("matcost"));
		Double Discount= Double.parseDouble(request.getParameter("dis"));
		String type= request.getParameter("Indicator");
		String Name= request.getParameter("Name");
		
	
		
		Pricing_details p = new Pricing_details();
		
		p.setMaterial(material);
		p.setLabours(Labours);
		p.setLab_cost(Labour_cost);
		p.setMat_cost(material_cost);
		p.setType(type);
		p.setDiscount(Discount);
		p.setName(Name);
		
	
		
		
		pricing_services property = new pricing_services();
		property.AddProperties(p);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Pricing_Properties.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
