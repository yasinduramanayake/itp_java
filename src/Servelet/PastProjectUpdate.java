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
 * Servlet implementation class PastProjectUpdate
 */
@WebServlet("/PastProjectUpdate")
public class PastProjectUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PastProjectUpdate() {
        super();
       
    }

	
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
		int proect_ID=Integer.parseInt(request.getParameter("proect_ID"));
		String myloc = request.getParameter("myprojects");
		int linkproj= Integer.parseInt(request.getParameter("linkproject"));
		
		PastProject p1=new PastProject();
		
		p1.setImages(myloc);
		p1.setDescription(Description);
		p1.setType(Type);
		p1.setProect_ID(proect_ID);
		
	     PastProjectService updatePastProject =new PastProjectService();
		updatePastProject.updatePastProject(p1);
		
		if(linkproj == 1) {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Designing_projects.jsp") ;
		dispatcher.forward(request, response);
		}
		else if(linkproj == 2) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Civil_construction_workes.jsp") ;
			dispatcher.forward(request, response);
			}
		else if(linkproj == 3) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Any_type_oof_aluminium_fabricate_workers.jsp") ;
			dispatcher.forward(request, response);
			}
		 else if(linkproj == 4) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Electrical_installation_workes.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkproj == 5) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Plumbing_workers.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkproj == 6) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Floor_carpeting_and_curtain.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkproj == 7) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Steel_and_stsinless_stell_fabricate_workes.jsp") ;
				dispatcher.forward(request, response);
				 }
		 else if(linkproj == 8) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Furniture_and_wooden_panelling_partitoning.jsp") ;
				dispatcher.forward(request, response);
				 }
		doGet(request, response);
	
	
	
	}

 
}
