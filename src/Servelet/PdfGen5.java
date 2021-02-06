package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.EventDBUtil;


@WebServlet("/PdfGen5")
public class PdfGen5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		EventDBUtil.generate_eventpdf();
		RequestDispatcher dis = request.getRequestDispatcher("EventAdds.jsp");
		dis.forward(request, response);
	}
	

}
