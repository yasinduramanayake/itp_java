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
 * Servlet implementation class Woodenfloring_search_servelet
 */
@WebServlet("/Woodenfloring_search_servelet")
public class Woodenfloring_search_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Woodenfloring_search_servelet() {
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
		
		Pricing_details wooden = new Pricing_details();
		wooden.setName(name);
		
		
		Search floring = new Search();
		
		ArrayList search5 = floring.Array5(wooden);
	
		if(search5.size()!= 0) {
		 request.setAttribute("Array5",search5);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Result_serach_wooden.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("value5","no values found from" +"\t" +"\t"+ name);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsucess_wodden.jsp") ;
			dispatcher.forward(request, response);
		}
		
		doGet(request, response);
	}

}
