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




@WebServlet("/CreateItems")
public class CreateItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double price = Double.parseDouble(request.getParameter("Itemprice"));
		String myloc = request.getParameter("myimg");
		String ICategory = request.getParameter("Itemcategory");
		String Iname = request.getParameter("Itemname");
		String Description = request.getParameter("Discription");
		
		
		item_details i = new item_details();
		i.setImage(myloc);
		i.setCategory(ICategory);
		i.setItem_name(Iname);
		i.setDescription(Description);
		i.setPrice(price);
		
		
		item_services property = new item_services();
		property.AddProperties(i);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/insertItems.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}
	}


