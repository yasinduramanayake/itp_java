package Servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Login_details;
import Model.cart;
import Service.Login_service;
import Service.cart_services;

/**
 * Servlet implementation class Checkout_cart_servelet
 */
@WebServlet("/Checkout_cart_servelet")
public class Checkout_cart_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkout_cart_servelet() {
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
		
		int UserIDc= Integer.parseInt(request.getParameter("ID"));
		String Passwordc= request.getParameter("PassWord");
		int quen = Integer.parseInt(request.getParameter("quanyy"));
		double price12 = Double.parseDouble(request.getParameter("pricey"));
		String color12 = request.getParameter("color12");
		
		System.out.println("fghng");
		
		Login_details check = new Login_details();
		
		check.setUserID(UserIDc);
		check.setPassword(Passwordc);
		
		Login_service loginc = new Login_service();
		
		int type1 = loginc.Login(check);
		
		if(type1 == 1) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserIDc);
	
					System.out.println("fghng");
				cart check_data = new cart();
				
				
				check_data.setPrice(price12);
				check_data.setColours(color12);
				check_data.setQuantity(quen);
				check_data.setCus_id((Integer)session.getAttribute("UID"));
				
		         
			
				cart_services cart_checkout = new cart_services();
				cart_checkout.InsertCartItem(check_data);
		     
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartCutomerRetrive.jsp") ;
				dispatcher.forward(request, response);
			
		}
		else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/loginunsuccessfull.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
