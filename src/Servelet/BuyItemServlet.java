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
import Service.PaymentServise;

/**
 * Servlet implementation class BuyItemServlet
 */
@WebServlet("/BuyItemServlet")
public class BuyItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyItemServlet() {
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
		
		HttpSession session = request.getSession();	
		
		Payment bi = new Payment();
		
		bi.setEmail(Email);
		bi.setPhoneNo(PhoneNo);
		bi.setCrdName(CrdName);
		bi.setCrdNo(CrdNo);
		bi.setCVV(CVV);
		bi.setEx_Date(Ex_Date);
		bi.setAmount(Amount);
		bi.setCus_id((Integer)session.getAttribute("UID"));
		
		
		PaymentServise Payment = new PaymentServise();
		Payment.insertbuyingItem(bi);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayBuyItemPayment.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	 
		doGet(request, response);
	}

}
