package Servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.PastProject;
import Service.SearchProject;

/**
 * Servlet implementation class Serach_project_civil_contruction
 */
@WebServlet("/Serach_project_civil_contruction")
public class Serach_project_civil_contruction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serach_project_civil_contruction() {
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
		
		
		PastProject pC = new PastProject();
	
		pC.setDescription(serchingdescription);
		
		SearchProject serProjectC = new SearchProject();
		
		ArrayList<PastProject> pastProjectsListC = serProjectC.getCivil_contructionprojects(pC);
		

	
			
			
		
			if(pastProjectsListC.size()!= 0) { 
				
			request.setAttribute("Civilproject",pastProjectsListC);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result_search_civil_construction.jsp") ;
			dispatcher.forward(request, response);
			}
			
			else {
				request.setAttribute("valuesearchprojectsCivil","no values found from" +"\t" +"\t"+ serchingdescription);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Unsuccess_Civil_constructions.jsp") ;
				dispatcher.forward(request, response);
			}
			
		doGet(request, response);
	}

}
