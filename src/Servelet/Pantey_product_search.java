package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.item_details;
import Service.Product_searchings;

/**
 * Servlet implementation class Pantey_product_search
 */
@WebServlet("/Pantey_product_search")
public class Pantey_product_search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pantey_product_search() {
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
		String name = request.getParameter("searchpanteyp");
		
		  item_details items = new item_details();
		    items.setItem_name(name);
				
				
		    Product_searchings prodecthotel = new Product_searchings();
				
				ArrayList searchproducts = prodecthotel.Arraypranteypro(items);
			
				if(searchproducts.size()!= 0) {
				 request.setAttribute("Arraypropantey",searchproducts);
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result_product_pantry_search.jsp") ;
					dispatcher.forward(request, response);
				}
				
				
				else  {
					request.setAttribute("valueproduct4","no values found from" +"\t" +"\t"+ name);
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/unsuccess_product_pantry_search.jsp") ;
					dispatcher.forward(request, response);
				}
		doGet(request, response);
	}

}
