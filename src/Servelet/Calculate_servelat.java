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
 * Servlet implementation class Calculate_servelat
 */
@WebServlet("/Calculate_servelat")
public class Calculate_servelat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculate_servelat() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Double Labour_cost= Double.parseDouble(request.getParameter("Lab_cost"));
		Double material_cost= Double.parseDouble(request.getParameter("mat_cost"));
		Double Discount= Double.parseDouble(request.getParameter("dis"));
		String Name= request.getParameter("itemName");
		
		Pricing_details C = new Pricing_details();
		C.setLab_cost(Labour_cost);
		C.setMat_cost(material_cost);
		C.setDiscount(Discount);
		
		
		pricing_services cal  = new pricing_services();
		Double price = cal.calculate(C);
		 request.setAttribute("price",  Name  + "\t" + "\t" + "price=" + "RS:"+ price);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/calculation.jsp") ;
			dispatcher.forward(request, response);
		
		doGet(request, response);
		
	}

}
