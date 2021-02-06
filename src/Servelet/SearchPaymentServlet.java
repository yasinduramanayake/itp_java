package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Payment;
import Service.SearchPaymentService;

/**
 * Servlet implementation class SearchPaymentServlet
 */
@WebServlet("/SearchPaymentServlet")
public class SearchPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPaymentServlet() {
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
		Double Amount = Double.parseDouble(request.getParameter("search2"));
		Payment H = new Payment();
		H.setAmount(Amount);
		
		
		SearchPaymentService  h1 =new SearchPaymentService();
		
		ArrayList searchsithmi = h1.Arraypayment(H);
	
		if(searchsithmi.size()!= 0) {
		 request.setAttribute("Arraypay1234",searchsithmi);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SearchPaymentDetauls.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			//request.setAttribute("values","no values found from" +"\t" +"\t"+ amount);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/OwnerDisplayPayment.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		
		doGet(request, response);
	

	}
}
