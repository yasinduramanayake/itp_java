package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.TransportService;
import Model.Transport_details;

/**
 * Servlet implementation class DeleteTrans
 */
@WebServlet("/DeleteTrans")
public class DeleteTrans extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name= request.getParameter("name");
		
		Transport_details tr = new Transport_details();
		
	
		tr.setName(name);
		
		TransportService delete = new TransportService();
		delete.DeleteTrans(tr);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/delete_trans.jsp");
		dispatcher.forward(request, response);
		
	}
	
	
}
