package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class preupdated_deigning_projects
 */
@WebServlet("/preupdated_deigning_projects")
public class preupdated_deigning_projects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public preupdated_deigning_projects() {
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
		String proect_ID=request.getParameter("proect_ID");
		String myloc_project = request.getParameter("myprojects");
		String linkproject = request.getParameter("linkproject");
		
		request.setAttribute("description_project",Description);
		request.setAttribute("Type_Projct",Type);
		request.setAttribute("proid_project",proect_ID);
		request.setAttribute("Project_image",myloc_project);
		request.setAttribute("linkproup_project",linkproject);
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/UpdatePastprojects.jsp") ;
		dispatcher.forward(request, response);
		
		
		doGet(request, response);
	}

}
