package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Login_details;
import Model.Order;
import Service.Login_service;
import Service.Order_services;

/**
 * Servlet implementation class Order_checkout_login_servelet
 */
@WebServlet("/Order_checkout_login_servelet")
public class Order_checkout_login_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order_checkout_login_servelet() {
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
		
		int UserIDv= Integer.parseInt(request.getParameter("ID"));
		String Passwordv= request.getParameter("PassWord");
		int quenyy = Integer.parseInt(request.getParameter("quantityv"));
		double price123 = Double.parseDouble(request.getParameter("pricev"));
		String email = request.getParameter("color12v");
		
		
		Login_details checkv = new Login_details();
		
		checkv.setUserID(UserIDv);
		checkv.setPassword(Passwordv);
		
		Login_service loginord = new Login_service();
		
		int type1 = loginord.Login(checkv);
		
		if(type1 == 1) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserIDv);
	
		      Order ordernew = new Order();
				
				
		      ordernew.setCusid((Integer)session.getAttribute("UID"));
		      ordernew.setPrice(price123);
		      ordernew.setQuantity(quenyy);
		      ordernew.setEmail(email);
				
				
				
				
				
			   Order_services order_checkouting = new Order_services();
			   if(quenyy > 0) {
			 order_checkouting.buyingItem(ordernew);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayOrder.jsp");
				dispatcher.forward(request, response);
			   }else {
					 request.setAttribute("msg","UnSuccessFully  ordered");
						RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/success.jsp") ;
						dispatcher.forward(request, response);
			   }
		}
		else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/loginunsuccessfull.jsp") ;
			dispatcher.forward(request, response);
		
		}
			   
		doGet(request, response);
	}

}
