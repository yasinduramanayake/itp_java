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


@WebServlet("/EventAdds")
public class EventAdds extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String eventcode = request.getParameter("ecode");
		
		try {
			List<Model.Event> eDetails = EventDBUtil.validate2(eventcode);
			request.setAttribute("eDetails", eDetails);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis4 = request.getRequestDispatcher("EventAdds.jsp");
		dis4.forward(request, response);
	}

}
