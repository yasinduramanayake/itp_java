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


@WebServlet("/UpdateEventServlet")
public class UpdateEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String eventcode = request.getParameter("eventcode");
		
		boolean isTrue;
		
		isTrue = EventDBUtil.updateevent(id, title, description, category, eventcode);
		
		if(isTrue == true) {
			
			List<Model.Event> eDetails = EventDBUtil.getEventDetails(id);
			request.setAttribute("eDetails", eDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("eventdetails.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Model.Event> eDetails = EventDBUtil.getEventDetails(id);
			request.setAttribute("eDetails", eDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("eventdetails.jsp");
			dis.forward(request, response);
		}
	}

}
