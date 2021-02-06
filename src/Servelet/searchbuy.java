package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Service.SearchM;
import Model.Buying;

/**
 * Servlet implementation class searchbuy
 */
@WebServlet("/searchbuy")
public class searchbuy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchbuy() {
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
		String Item_name =request.getParameter("search");
		
		Buying b = new Buying();
		b.setItemName(Item_name);
		
		
		SearchM buy = new SearchM();
		
		ArrayList searchmr = buy.Arraybuym(b);
	
		if(searchmr.size()!= 0) {
		 request.setAttribute("Arraymettan",searchmr);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Resultsearch_buy.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("Errormm","no values found from" +"\t" +"\t"+ Item_name);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsucessful_buying.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}