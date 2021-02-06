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
import Model.Login_details;
import Model.cart;
import Service.Login_service;
import Service.buying_services;
import Service.cart_services;

/**
 * Servlet implementation class Checkout_buying_servelet
 */
@WebServlet("/Checkout_buying_servelet")
public class Checkout_buying_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkout_buying_servelet() {
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
		
		int UserIDb= Integer.parseInt(request.getParameter("ID"));
		String Passwordb= request.getParameter("PassWord");
		double priceb = Double.parseDouble(request.getParameter("priceb"));
		String colorb = request.getParameter("colorb");
		String itemnameb = request.getParameter("itemnameb");
		
		
		
		Login_details checkb = new Login_details();
		
		checkb.setUserID(UserIDb);
		checkb.setPassword(Passwordb);
		
		Login_service loginb = new Login_service();
		
		int type1 = loginb.Login(checkb);
		
		if(type1 == 1) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserIDb);
	
					
		      Buying check_datab = new Buying();
				
				
		      check_datab.setPrice(priceb);
		      check_datab.setColor(colorb);
		      check_datab.setItemName(itemnameb);
		      check_datab.setCusID((Integer)session.getAttribute("UID"));
				
		         
			
		      buying_services buy_checkout = new buying_services();
		      buy_checkout.insertbuyingItem(check_datab);
		     request.setAttribute("pricebuy",priceb);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/BuyItemPayment.jsp") ;
				dispatcher.forward(request, response);
			
		}
		else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/loginunsuccessfull.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}
}
