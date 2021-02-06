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
import Service.reset_services;

/**
 * Servlet implementation class Reset_servelet
 */
@WebServlet("/Reset_servelet")
public class Reset_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reset_servelet() {
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
		String code =request.getParameter("code");
		
		String confirmpassword = request.getParameter("confirmp");
		
		Login_details reset = new Login_details();
		
		
		reset.setVerification_code(code);
		reset.setNew_password(confirmpassword);
		
		
		reset_services resetpassword = new reset_services();
		resetpassword.reset(reset);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Login.jsp") ;
		dispatcher.forward(request, response);
		
		
		
		doGet(request, response);
	}

}
