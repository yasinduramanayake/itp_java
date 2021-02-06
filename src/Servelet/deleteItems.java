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


@WebServlet("/deleteItems")
public class deleteItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int product_id= Integer.parseInt(request.getParameter("Itemname"));
		int link= Integer.parseInt(request.getParameter("link"));
		
		item_details d = new item_details();
		
		d.setProductId(product_id);
		
		item_services delete = new item_services();
		delete.deleteProperties(d);
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
