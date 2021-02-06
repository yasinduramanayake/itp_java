package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Login_details;
import Service.Login_service;

/**
 * Servlet implementation class new_login_page
 */
@WebServlet("/new_login_page")
public class new_login_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public new_login_page() {
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
		
		int UserIDc= Integer.parseInt(request.getParameter("ID"));
		String Passwordc= request.getParameter("PassWord");
	
		
		
		Login_details checknew = new Login_details();
		
		checknew.setUserID(UserIDc);
		checknew.setPassword(Passwordc);
		
		Login_service loginc = new Login_service();
		
		int type1 = loginc.Login(checknew);
		
		if(type1 == 1) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserIDc);
		      
		      
		      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cartCutomerRetrive.jsp") ;
				dispatcher.forward(request, response);
		
	}
		else {
		     
		      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/loginunsuccessfull.jsp") ;
				dispatcher.forward(request, response);
		}
		doGet(request, response);
}
}
