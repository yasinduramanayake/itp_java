package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Pricing_details;
import Service.Search;

/**
 * Servlet implementation class Search_Household_Servlet
 */
@WebServlet("/Search_Household_Servlet")
public class Search_Household_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search_Household_Servlet() {
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
String name = request.getParameter("search");
		
		Pricing_details House = new Pricing_details();
		House.setName(name);
		
		
		Search Hold = new Search();
		
		ArrayList search4 = Hold.Array4(House);
	
		if(search4.size()!= 0) {
		 request.setAttribute("Array4",search4);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Result_Household_search.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("value4","no values found from" +"\t" +"\t"+ name);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/unsucces_Household.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
