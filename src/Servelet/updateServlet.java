package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Order;
import Service.Order_services;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
   
    public updateServlet() {
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
	
	

	
	int Quantity= Integer.parseInt(request.getParameter("Quantity"));
	int oid= Integer.parseInt(request.getParameter("oid"));

	
	
	Order o1 = new Order();


	o1.setQuantity(Quantity);
	
	o1.setOrderID(oid);
	
	
	
   Order_services UpdateOrder = new Order_services();
	UpdateOrder.UpdateOrder(o1);
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DisplayOrder.jsp") ;
	dispatcher.forward(request, response);
	doGet(request, response);
	

}
	
	

	
}
	
