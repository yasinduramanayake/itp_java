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
 * Servlet implementation class Serach_Sofa_Servelet
 */
@WebServlet("/Serach_Sofa_Servelet")
public class Serach_Sofa_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serach_Sofa_Servelet() {
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
		
		Pricing_details Sofaset = new Pricing_details();
		Sofaset.setName(name);
		
		
		Search Sofa = new Search();
		
		ArrayList search2 = Sofa.Array2(Sofaset);
	
		if(search2.size()!= 0) {
		 request.setAttribute("Array2",search2);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Result_search_Sofa.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("value2","no values found from" +"\t" +"\t"+ name);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsuccess_Sofa.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
