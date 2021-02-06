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
import Model.Payment;
import Service.Order_calculation;

/**
 * Servlet implementation class Order_calculation_servelet
 */
@WebServlet("/Order_calculation_servelet")
public class Order_calculation_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order_calculation_servelet() {
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
	HttpSession session = request.getSession();
	    
			
		
		Order order_cal = new Order();
		
		
		if((Integer)session.getAttribute("UID") != null) {
			order_cal.setCusid((Integer)session.getAttribute("UID"));
			
			Order_calculation ordernow= new Order_calculation();
			Double price = ordernow.ordersumming(order_cal);
			request.setAttribute("varaniorder",price);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ordering_calculation_show.jsp") ;
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
		
		
	}
		
}
