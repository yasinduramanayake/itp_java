package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Payment;
import Model.cart;
import Service.Cart_calculation_m;
import Service.payment_calculation;

/**
 * Servlet implementation class Payment_sum_amount
 */
@WebServlet("/Payment_sum_amount")
public class Payment_sum_amount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment_sum_amount() {
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
	    
			
		
		Payment psith = new Payment();
		
		
		if((Integer)session.getAttribute("UID") != null) {
		 
		psith.setCus_id((Integer)session.getAttribute("UID"));
		payment_calculation Payment_sum = new payment_calculation();
		
		Double sumpay = Payment_sum.Amountmaking(psith);
		request.setAttribute("sumpay", sumpay);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Sum_print_calculation.jsp") ;
		dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp") ;
			dispatcher.forward(request, response);
		}
		
		doGet(request, response);
	}

}
