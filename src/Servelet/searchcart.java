package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Buying;
import Model.cart;
import Service.SearchM;


/**
 * Servlet implementation class searchcart
 */
@WebServlet("/searchcart")
public class searchcart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchcart() {
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
		
	 int Cart_ID = Integer.parseInt(request.getParameter("search"));
		
		cart c = new cart();
		c.setCart_id(Cart_ID);
		
		
		SearchM cart = new SearchM();
		
		ArrayList searchmrc = cart.Arraycartm(c);
	
		if(searchmrc.size()!= 0) {
		 request.setAttribute("Arrayrane",searchmrc);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Resultsearch_cart.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("Errorcart","no values found from" +"\t" +"\t"+ Cart_ID);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/unsuccessfull_cart.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}}