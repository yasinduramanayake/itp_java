package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.cart;
import Service.cart_services;

/**
 * Servlet implementation class Delete_Properties
 */
@WebServlet("/DELETE_cart")
public class DELETE_cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		int valu_val= Integer.parseInt(request.getParameter("validate"));
		int Cart_ID= Integer.parseInt(request.getParameter("cartid"));
		
		cart d = new cart();
		
		d.setCart_id(Cart_ID);
		cart_services Delete = new cart_services();
		Delete.deletecartItem(d);
		if(valu_val == 1) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartRETRIVE.jsp") ;
			dispatcher.forward(request, response);
			} 
			
			else if(valu_val == 2) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartCutomerRetrive.jsp") ;
				dispatcher.forward(request, response);
			}
		doGet(request, response);
		
	}

}