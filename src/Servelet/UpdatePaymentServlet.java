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
 * Servlet implementation class UpdatePaymentServlet
 */
@WebServlet("/UpdatePaymentServlet")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePaymentServlet() {
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

		
		String Email = request.getParameter("email");
		int PhoneNo = Integer.parseInt(request.getParameter("phone"));
		String CrdName = request.getParameter("cusName");
		int CrdNo = Integer.parseInt(request.getParameter("cardNo")); 
		int CVV = Integer.parseInt(request.getParameter("cvv")); 
		String  Ex_Date = request.getParameter("expiryDate");
		Double Amount= Double.parseDouble(request.getParameter("amount"));
		
		Payment v = new Payment();
		
		v.setEmail(Email);
		v.setPhoneNo(PhoneNo);
		v.setCrdName(CrdName);
		v.setCrdNo(CrdNo);
		v.setCVV(CVV);
		v.setEx_Date(Ex_Date);
		v.setAmount(Amount);
		
		
		
		PaymentServise Payment = new PaymentServise();
		Payment.updateBuyingItem(v);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateBuyItemPayment.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
