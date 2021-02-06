 package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Service.CusService;
import Model.Customer;

@WebServlet("/DeleteCustomerDetails")
public class DeleteCustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteCustomerDetails() {
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
		int uid = Integer.parseInt(request.getParameter("uid"));
		
		
		Customer c2= new Customer();
		c2.setUID(uid);

		CusService deleteCustomer=new  CusService();
		deleteCustomer.DeleteCustomerDetails(c2);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/succes.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
		
	}

}
