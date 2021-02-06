package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.PastProject;
import Service.PastProjectService;

/**
 * Servlet implementation class Past_project_insert
 */
@WebServlet("/Past_project_insert")
public class Past_project_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Past_project_insert() {
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
		String Description =request.getParameter("Description");
		String Type= request.getParameter("Type");
		String myloc1 = request.getParameter("myprojects");
		
		
		PastProject pr=new PastProject();
		
		
		pr.setDescription(Description);
		pr.setType(Type);
		pr.setImages(myloc1);
		
		 
		PastProjectService PastProject =new PastProjectService();
		PastProject.AddDetails(pr);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AdminDashboard.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
