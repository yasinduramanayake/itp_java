package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Buying;
import Service.buying_services;

/**
 * Servlet implementation class Update_buying
 */
@WebServlet("/Update_buying")
public class Update_buying extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
		int buy_id = Integer.parseInt(request.getParameter("Buy_ID"));
				
		Double price= Double.parseDouble(request.getParameter("price"));
		String color= request.getParameter("colour");
		int customerID= Integer.parseInt(request.getParameter("customer_id"));
		String itemname= request.getParameter("itemName");
		
			
		Buying m = new Buying();
		
		m.setBuyid(buy_id);
		m.setPrice(price);
		m.setColor(color);
		m.setCusID(customerID);
		m.setItemName(itemname);
				
		buying_services buying = new buying_services();
		buying.updatebuyingItem(m);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/buyRETRIVE.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
		
	}
		
		
		
		
	}


