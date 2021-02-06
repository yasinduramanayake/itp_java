package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Login_details;
import Service.Login_service;

/**
 * Servlet implementation class Forgotton_password_servelet
 */
@WebServlet("/Forgotton_password_servelet")
public class Forgotton_password_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forgotton_password_servelet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id =Integer.parseInt( request.getParameter("ID"));
		String Name = request.getParameter("Name");
		String email = request.getParameter("Email");
		
		Login_details l = new Login_details();
		
		l.setName(Name);
		l.setUserID(id);
		l.setEmail(email);
		
		Login_service smtp = new Login_service();
		smtp.sendemail(l);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Restet.jsp") ;
		dispatcher.forward(request, response);
		
		doGet(request, response);
	}

}
