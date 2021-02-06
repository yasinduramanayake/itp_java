package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.PastProjectService;

import Model.PastProject;

/**
 * Servlet implementation class PastProjectDelete
 */
@WebServlet("/PastProjectDelete")
public class PastProjectDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PastProjectDelete() {
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
		int linkpro= Integer.parseInt(request.getParameter("linkproject"));
	  int projectID=Integer.parseInt(request.getParameter("proect_ID"));
		PastProject p=new PastProject();
		p.setProect_ID(projectID);
	
		
		
		PastProjectService deleteproject=new PastProjectService();
		deleteproject.DeletePastProject(p);
		
		 if(linkpro == 1) {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Designing_projects.jsp") ;
		dispatcher.forward(request, response);
		 }
		 else if(linkpro == 2) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Civil_construction_workes.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkpro == 3) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Any_type_oof_aluminium_fabricate_workers.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkpro == 4) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Electrical_installation_workes.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkpro == 5) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Plumbing_workers.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkpro == 6) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Floor_carpeting_and_curtain.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkpro == 7) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Steel_and_stsinless_stell_fabricate_workes.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkpro == 8) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Furniture_and_wooden_panelling_partitoning.jsp") ;
				dispatcher.forward(request, response);
				 }
		doGet(request, response);
	}

}
