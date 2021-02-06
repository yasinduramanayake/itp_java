package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.item_details;
import Service.item_services;

/**
 * Servlet implementation class updates_prducts_final
 */
@WebServlet("/updates_prducts_final")
public class updates_prducts_final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updates_prducts_final() {
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
		int product_id= Integer.parseInt(request.getParameter("Itemid"));
		String myloc = request.getParameter("myimg");
		String ICategory = request.getParameter("Itemcategory");
		String Iname = request.getParameter("Itemname");
		String Description = request.getParameter("Discription");
		int link= Integer.parseInt(request.getParameter("link"));
		Double pricingfin = Double.parseDouble(request.getParameter("pricingfinal"));
		
		item_details u = new item_details();
		u.setProductId(product_id);
		u.setImage(myloc);
		u.setCategory(ICategory);
		u.setItem_name(Iname);
		u.setDescription(Description);
		u.setPrice(pricingfin);
	
		
		item_services product = new item_services();
		product.updateProperties(u);
		if(link==1) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HotelFurniturejsp.jsp") ;
			dispatcher.forward(request, response);	
		}
		else if(link==2) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Household.jsp") ;
			dispatcher.forward(request, response);	
		}
		else if(link==3) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/OfficeFurnitures.jsp") ;
			dispatcher.forward(request, response);	
		}
		else if(link==4) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Wooden&decking.jsp") ;
			dispatcher.forward(request, response);	
		}
		else if(link==5) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SofaSetes_Items.jsp") ;
			dispatcher.forward(request, response);	
		}
		else if(link==6) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Pantey_and_kitchen_items.jsp") ;
			dispatcher.forward(request, response);	
		}
		doGet(request, response);
	}

}
