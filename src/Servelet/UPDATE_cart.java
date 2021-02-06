package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.cart;
import Service.cart_services;

/**
 * Servlet implementation class Update_buying
 */
@WebServlet("/UPDATE_cart")
public class UPDATE_cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
		
		int valu_val = Integer.parseInt(request.getParameter("validate"));
		Double Price= Double.parseDouble(request.getParameter("Price"));
		String Colour= request.getParameter("Colours");
		int Quantity =Integer.parseInt( request.getParameter("Quantity"));
		int CusID =Integer.parseInt( request.getParameter("cusID"));
		int CartID=Integer.parseInt( request.getParameter("CartID"));
		
			
		cart v = new cart();
		
		
		v.setPrice(Price);
		v.setColours(Colour);
		v.setQuantity(Quantity);
		v.setCus_id(CusID);
		v.setCart_id(CartID);
				
		cart_services cart = new cart_services();
		cart.updatecartItem(v);
		if(valu_val == 1) {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartRETRIVE.jsp") ;
		dispatcher.forward(request, response);
		} 
		
		else if(valu_val == 2) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartCutomerRetrive.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
		
	}
		
		
		
		
	}

