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
 * Servlet implementation class Update_Pricing_Properties_Final
 */
@WebServlet("/Update_Pricing_Properties_Final")
public class Update_Pricing_Properties_Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_Pricing_Properties_Final() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		String material= request.getParameter("mat");
		String Labours= request.getParameter("lab");
		Double Labour_cost= Double.parseDouble(request.getParameter("labcost"));
		Double material_cost= Double.parseDouble(request.getParameter("matcost"));
		Double Discount= Double.parseDouble(request.getParameter("dis"));
		
		String type= request.getParameter("type");
		int pid = Integer.parseInt(request.getParameter("pid"));
	int link = Integer.parseInt(request.getParameter("link"));
		
		Pricing_details o = new Pricing_details();
		
		o.setMaterial(material);
		o.setLabours(Labours);
		o.setLab_cost(Labour_cost);
		o.setMat_cost(material_cost);
		o.setDiscount(Discount);
		
		o.setPid(pid);
		o.setType(type);
		
	
		

		
		
		pricing_services a = new pricing_services();
		a.updateProperties(o);
		if(link == 1) {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HotelFurnitureProperties.jsp");
		
		dispatcher.forward(request, response);
		}
		else if(link == 2) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Pantey_and_kitchen.jsp");
			
			dispatcher.forward(request, response);
		}
		else if(link == 3) {
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WoodenDecking_and_timber_floring.jsp");
			
			dispatcher.forward(request, response);
			
		}
		else if(link == 4) {
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Office_Furniture_properties.jsp");
			
			dispatcher.forward(request, response);
		}
		else if(link == 5) {
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Sofasetes_properties.jsp");
			
			dispatcher.forward(request, response);
		}
		else if(link == 6) {
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HouseHoldFurniturePropeties.jsp");
			
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
