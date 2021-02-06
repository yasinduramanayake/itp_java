package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Order;
import Service.Order_services;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public deleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	
	int orderId= Integer.parseInt(request.getParameter("oID"));

	
	
	
	Order o2 = new Order();
	o2.setOrderID(orderId);
	
	
	
	
	
   Order_services deleteOrder = new Order_services();
	deleteOrder.deleteOrder(o2);
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayOrder.jsp") ;
	dispatcher.forward(request, response);
	doGet(request, response);
	

}

}
