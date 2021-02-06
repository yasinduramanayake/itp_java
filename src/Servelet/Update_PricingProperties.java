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
 * Servlet implementation class Update_PricingProperties
 */
@WebServlet("/Update_PricingProperties")
public class Update_PricingProperties extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		

	request.setAttribute("msg1",material);
	request.setAttribute("msg2",Labours);
	request.setAttribute("msg3",Labour_cost);
	request.setAttribute("msg4",material_cost);
	request.setAttribute("msg5",Discount);
	request.setAttribute("msg6",type);
	request.setAttribute("msg7",pid);
	request.setAttribute("msg8",link);
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Pricing_update.jsp") ;
	dispatcher.forward(request, response);
	
		doGet(request, response);
	}

}
