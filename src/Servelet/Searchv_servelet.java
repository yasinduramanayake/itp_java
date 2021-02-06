package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Order;
import Service.searchV;

/**
 * Servlet implementation class Searchv_servelet
 */
@WebServlet("/Searchv_servelet")
public class Searchv_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Searchv_servelet() {
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
		
		Double Amount = Double.parseDouble(request.getParameter("searchv"));
				
				Order Ordsearch = new Order();
				Ordsearch.setPrice(Amount);
				
				
				searchV searchingorders= new searchV();
				
				ArrayList varaniarr = searchingorders.Arrayordering(Ordsearch);
			
				if(varaniarr.size()!= 0) {
				 request.setAttribute("Arrayvarani",varaniarr);
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/results_order_search.jsp") ;
					dispatcher.forward(request, response);
				}
				
				
				else  {
					request.setAttribute("valuevarani","no values found from" +"\t" +"\t"+ Amount);
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/unsuccess_ordr-search.jsp") ;
					dispatcher.forward(request, response);
				}
		doGet(request, response);
	}

}
