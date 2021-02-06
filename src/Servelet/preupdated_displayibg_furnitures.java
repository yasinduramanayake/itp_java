package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class preupdated_displayibg_furnitures
 */
@WebServlet("/preupdated_displayibg_furnitures")
public class preupdated_displayibg_furnitures extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public preupdated_displayibg_furnitures() {
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
		int product_id= Integer.parseInt(request.getParameter("Itemid"));
		String myloc = request.getParameter("myimg");
		String ICategory = request.getParameter("Itemcategory");
		String Iname = request.getParameter("Itemname");
		String Description = request.getParameter("Discription");
		int link= Integer.parseInt(request.getParameter("link"));
		Double pricing = Double.parseDouble(request.getParameter("pricing"));
		

	request.setAttribute("msgimg",myloc);
	request.setAttribute("cat1",ICategory);
	request.setAttribute("proid",product_id);
	request.setAttribute("mitemna",Iname);
	request.setAttribute("despro",Description);
	request.setAttribute("linkproup",link);
	request.setAttribute("pricesell",pricing);
	
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ffinal_update_products_updaings.jsp") ;
	dispatcher.forward(request, response);
		doGet(request, response);
	}

}
