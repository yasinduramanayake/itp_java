package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Buying;
import Service.buying_services;

/**
 * Servlet implementation class Delete_Properties
 */
@WebServlet("/Delete_buying")
public class Delete_buying extends HttpServlet {
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
		
		int buyid= Integer.parseInt(request.getParameter("buy_id"));
		
		Buying D = new Buying();
		
	
		D.setBuyid(buyid);
		
		buying_services Delete = new buying_services();
		Delete.deletebuyingItem(D);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/buyRETRIVE.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
		
	}

}
