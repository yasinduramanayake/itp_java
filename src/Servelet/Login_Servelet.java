package Servelet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Login_details;

import javax.servlet.http.HttpSession;
import Service.Login_service;


/**
 * Servlet implementation class Login_Servelet
 */
@WebServlet("/Login_Servelet")
public class Login_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int UserID= Integer.parseInt(request.getParameter("ID"));
		String Password= request.getParameter("PassWord");
		
		Login_details L = new Login_details();
		
		L.setUserID(UserID);
		L.setPassword(Password);
		
		Login_service login = new Login_service();
		
		int type = login.Login(L);
		
		if(type == 1) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserID);
		      
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Customer_Dashboard.jsp") ;
			dispatcher.forward(request, response);
			
		}
		else if(type == 2 ) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserID);
		    
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminDashboard.jsp") ;
			dispatcher.forward(request, response);
			
		}
		
		
		else if(type == 3 ) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserID);
		    
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminDashboard.jsp") ;
			
			dispatcher.forward(request, response);
		
		}
		else {
			
			 
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/loginunsuccessfull.jsp") ;
			dispatcher.forward(request, response);
		
		}
		doGet(request, response);
	}

}
