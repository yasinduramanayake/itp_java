package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Visit_pre_updated
 */
@WebServlet("/Visit_pre_updated")
public class Visit_pre_updated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Visit_pre_updated() {
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
		// TODO Auto-generated method stub	String material= request.getParameter("mat");
		int id= Integer.parseInt(request.getParameter("visiteId"));
		String fnme= request.getParameter("fullname");
		String nic= request.getParameter("NIC");
		String emil= request.getParameter("Email");
		
		String pnum= request.getParameter("pNum");
		String addres = request.getParameter("adres");
	String msges =request.getParameter("message");
		

	request.setAttribute("id",id);
	request.setAttribute("fn",fnme);
	request.setAttribute("nic",nic);
	request.setAttribute("emil",emil);
	request.setAttribute("pnum",pnum);
	request.setAttribute("addres", addres);
	request.setAttribute("msseg",msges);

	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdateVisite.jsp") ;
	dispatcher.forward(request, response);
		doGet(request, response);
	}

}
