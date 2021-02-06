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
 * Servlet implementation class Serach_Hotel_servelet
 */
@WebServlet("/Serach_Hotel_servelet")
public class Serach_Hotel_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serach_Hotel_servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("search");
		
		Pricing_details S = new Pricing_details();
		S.setName(name);
		
		
		Search Se = new Search();
		
		ArrayList search = Se.Array(S);
	
		if(search.size()!= 0) {
		 request.setAttribute("Array",search);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Result_hotel.jsp") ;
			dispatcher.forward(request, response);
		}
		
		
		else  {
			request.setAttribute("value","no values found from" +"\t" +"\t"+ name);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsuccess.jsp") ;
			dispatcher.forward(request, response);
		}
		
		doGet(request, response);
	}

}
