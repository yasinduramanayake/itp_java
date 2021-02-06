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
import Model.Transport_details;
import Service.Dhara_search;
import Service.SearchM;

/**
 * Servlet implementation class Dhara_servelet_transport
 */
@WebServlet("/Dhara_servelet_transport")
public class Dhara_servelet_transport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dhara_servelet_transport() {
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
	String name =request.getParameter("searchs");
		
	Transport_details b = new Transport_details();
		b.setName(name);
		
		
		Dhara_search dhara = new Dhara_search();
		
		ArrayList searchd = dhara.Arrayda(b);
	
		if(searchd.size()!= 0) {
		 request.setAttribute("Arraydhara",searchd);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Dhara_search_reseults.jsp") ;
			dispatcher.forward(request, response);
		}
		
	
		
		doGet(request, response);
	}

}
