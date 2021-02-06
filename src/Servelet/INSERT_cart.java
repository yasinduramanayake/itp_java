package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.cart;
import Service.cart_services;

@WebServlet("/INSERT_cart")
	public class INSERT_cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
		 HttpSession session = request.getSession();
		Double Price= Double.parseDouble(request.getParameter("price"));
		String Colour= request.getParameter("colours");
		int Quantity =Integer.parseInt( request.getParameter("quantity"));
		
		System.out.println("fghng");
		//to check session is available
		//if log or not
		if((Integer)session.getAttribute("UID") != null) {
			
		cart v = new cart();
		
		v.setPrice(Price);
		v.setColours(Colour);
		v.setQuantity(Quantity);
		
		//session id assign to customer id
		v.setCus_id((Integer)session.getAttribute("UID"));
		
	
		cart_services cart = new cart_services();
		cart.InsertCartItem(v);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartCutomerRetrive.jsp") ;
		dispatcher.forward(request, response);
	    }
	    else {
	    
	    	request.setAttribute("cartlogpr",Price);
	    	request.setAttribute("cartlogcolo",Colour);
	    	request.setAttribute("cartlogquan",Quantity);
	    	//to login
	    	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Checkout_Login_cart.jsp");
			dispatcher.forward(request, response);
	    }
		doGet(request, response);
System.out.println("gb0");
		
		//<h3 id="head3"><%= (new java.util.Date()).toLocaleString()%></h3>
		
	}
}
