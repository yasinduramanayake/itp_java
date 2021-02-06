package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.PastProjectService;
import Service.SearchProject;

import Model.PastProject;

/**
 * Servlet implementation class SearchPastproject
 */
@WebServlet("/SearchPastproject")
public class SearchPastproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchPastproject() {
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
		String serchingdescription = request.getParameter("searchProjectsall");
		
		
		PastProject p3 = new PastProject();
		
		p3.setDescription(serchingdescription);
		
		SearchProject serProject = new SearchProject();
		
		ArrayList<PastProject> pastProjectsList = serProject.getPastProjects(p3);
		

	
			
			
		
			if(pastProjectsList.size()!= 0) { 
				
			request.setAttribute("designingproject",pastProjectsList);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result_designing_projects_searching.jsp") ;
			dispatcher.forward(request, response);
			}
			
			else {
				request.setAttribute("valuesearchprojects","no values found from" +"\t" +"\t"+ serchingdescription);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsuccess_projects_all.jsp") ;
				dispatcher.forward(request, response);
			}
		
			
		
			
		
			
			
			
		

		doGet(request, response);
	}
}


