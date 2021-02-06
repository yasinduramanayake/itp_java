package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Buying;
import Model.cart;
import Service.buying_services;
import Service.cart_services;

@WebServlet("/Insert_buying")
	public class Insert_buying extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
		
		
		HttpSession session = request.getSession();		
	   	Double price= Double.parseDouble(request.getParameter("price"));
        String color= request.getParameter("colour");
        String itemName= request.getParameter("itemname");
        String radio = request.getParameter("valuesc1");
		
		
		//to check session is available
		//if log or not
		if((Integer)session.getAttribute("UID") != null) {
			
	    Buying b = new Buying();
		
	    b.setPrice(price);
        b.setColor(color);
        
      //session id assign to customer id
        b.setCusID((Integer)session.getAttribute("UID"));
        b.setItemName(itemName);
	
        buying_services buying = new buying_services();
        buying.insertbuyingItem(b);
        
  	  if (radio.equals("No")) {
        request.setAttribute("pricebuy", price);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/BuyItemPayment.jsp");
        dispatcher.forward(request, response);
  	  }
  	  else if(radio.equals("Yes")) {
  		   request.setAttribute("pricebuywtrans", price);
  	        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/buingyt---ransport.jsp");
  	        dispatcher.forward(request, response);
  	  }
       
	    }
	    else {
	    
	    	request.setAttribute("buy_mp",price);
	    	request.setAttribute("buy_mc",color);
	     	request.setAttribute("buy_mi",itemName);
	    	
	    	//to login
	    	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Checkout_Login_buying.jsp");
			dispatcher.forward(request, response);
	    }
		doGet(request, response);


	       
	    }
		
		
		
		
	}


