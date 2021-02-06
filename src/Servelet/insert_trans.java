package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.Cart_calculation_m;
import Service.TransportService;
import Model.Transport_details;
import Model.cart;


@WebServlet("/insert_trans")
public class insert_trans extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
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
		
		
		
		HttpSession session = request.getSession();
		
		cart transportcal = new cart();
		transportcal.setCus_id((Integer)session.getAttribute("UID"));
	
		
		Cart_calculation_m cartcalt = new Cart_calculation_m();
		Double prefinal = cartcalt.calculateCart(transportcal);
		
	
		

		
		Double transprice = distance * size;
		Double final_pay = transprice + prefinal;
		
		
		request.setAttribute("transprice",final_pay);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cart_item_withtransport_payment.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
