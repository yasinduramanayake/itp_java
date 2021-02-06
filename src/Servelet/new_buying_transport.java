package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Transport_details;
import Model.cart;
import Service.Cart_calculation_m;
import Service.TransportService;

/**
 * Servlet implementation class new_buying_transport
 */
@WebServlet("/new_buying_transport")
public class new_buying_transport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public new_buying_transport() {
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
Double pricing = Double.parseDouble(request.getParameter("pricings"));
		Double distance= Double.parseDouble(request.getParameter("Distance"));
		String Location= request.getParameter("location");
		Double size= Double.parseDouble(request.getParameter("size"));
		String C_name= request.getParameter("ID");
		String payment= request.getParameter("payment");
		
		Transport_details t = new Transport_details();
	
		
		t.setDistance(distance);
		t.setLocation(Location);
		t.setStreetsize(size);
		t.setName(C_name);
		t.setPaymentMethod(payment);
		
		
		TransportService trans = new TransportService();
		trans.AddTransport(t);

		Double transprice = distance * size;
		Double final_pay1 = transprice + pricing;
		
		
		request.setAttribute("transprice1",final_pay1);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cart_item_withtransport_payment.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}



		
	

}

