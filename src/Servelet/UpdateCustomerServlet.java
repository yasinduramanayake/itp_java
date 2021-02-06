package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.CustomerDBUtil;

import Model.Customer;
import Model.Customer_pamudi;


@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String category = request.getParameter("category");
		String fullName = request.getParameter("fullName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String registerid = request.getParameter("registerid");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updatecustomer(id, category, fullName, phone, email, registerid);
		
		if(isTrue == true) {
			
			List<Customer_pamudi> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Customer_pamudi> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
