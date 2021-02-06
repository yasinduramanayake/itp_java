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
 * Servlet implementation class Pantey_kitchen_search_servelet
 */
@WebServlet("/Pantey_kitchen_search_servelet")
public class Pantey_kitchen_search_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pantey_kitchen_search_servelet() {
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
		
		Pricing_details Pantey = new Pricing_details();
		Pantey.setName(name);
		
		
		Search Kitchen = new Search();
		
		ArrayList search3 = Kitchen.Array3(Pantey);
	
		if(search3.size()!= 0) {
		 request.setAttribute("Array3",search3);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Result_Search_pantey.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("value3","no values found from" +"\t" +"\t"+ name);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsuccess_Pantey.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
