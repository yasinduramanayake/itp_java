package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Order;
import Service.Order_services;

/**
 * Servlet implementation class Order_servelet
 */
@WebServlet("/Order_servelet")
public class Order_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order_servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		Double Price= Double.parseDouble(request.getParameter("Price"));
		int Quantity= Integer.parseInt(request.getParameter("Quantity"));
	
		String Email= request.getParameter("Email");
		
		if((Integer)session.getAttribute("UID") != null) {
		Order or = new Order();
		
		
		or.setCusid((Integer)session.getAttribute("UID"));
		or.setPrice(Price);
		or.setQuantity(Quantity);
		or.setEmail(Email);
		
		
		
		
		
	   Order_services buying = new Order_services();
	   if(Quantity > 0) {
		buying.buyingItem(or);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayOrder.jsp");
		dispatcher.forward(request, response);
	   }else {
			 request.setAttribute("msg","UnSuccessFully  ordered");
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/success.jsp") ;
				dispatcher.forward(request, response);
	   }
	   
		}
		else {
			request.setAttribute("varaniprice",Price);	    	
	    	request.setAttribute("varaniquantity",Quantity);
	    	request.setAttribute("varaniEmail",Email);
	    	
	     	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Order_checkoutLogin_varani.jsp");
			dispatcher.forward(request, response);
	    	
		}
		doGet(request, response);
	}

}
