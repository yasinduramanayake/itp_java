package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.visiting_services;


@WebServlet("/PdfGenVisite")
public class PdfGenVisite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		visiting_services.genarate_pdf();
		RequestDispatcher dis = request.getRequestDispatcher("CreateVisite.jsp");
		dis.forward(request, response);
	}

}
