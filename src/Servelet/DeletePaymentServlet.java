package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Payment;
import Service.PaymentServise;

/**
 * Servlet implementation class DeletePaymentServlet
 */
@WebServlet("/DeletePaymentServlet")
public class DeletePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePaymentServlet() {
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
	
	
		int P_id = Integer.parseInt(request.getParameter("P_id"));
	 

		
		Payment u = new Payment();
		
		//u.setEmail(Email);
		//u.setPhoneNo(PhoneNo);
	
		u.setP_id(P_id);
		//u.setCrdNo(CrdNo);
		//u.setCVV(CVV);
		//u.setEx_Date(Ex_Date);
		//u.setAmount(Amount);
		
		PaymentServise Payment = new PaymentServise();
		Payment.DeleteBuyingItem(u);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DeleteBuyItemPayment.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
		doGet(request, response);
	}

}
