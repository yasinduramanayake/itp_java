package Servelet;

import java.awt.Event;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.EventDBUtil;


@WebServlet("/DeleteEventServlet")
public class DeleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = EventDBUtil.deleteEvent(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("eventInsertSearch.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<Model.Event> eventDetails = EventDBUtil.getEventDetails(id);
			request.setAttribute("eventDetails", eventDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("eventdetails.jsp");
			dispatcher.forward(request, response);
		}
	}

}
