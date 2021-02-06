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

@WebServlet("/UpdateCustomerDetails")
public class UpdateCustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public UpdateCustomerDetails() {
        super();
    }
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at:  ").append(request.getContextPath());

	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int uid =Integer.parseInt(request.getParameter("uidcs"));
		String Name=request.getParameter("Name");
		 String Address=request.getParameter("Address");
		int contantNum=Integer.parseInt(request.getParameter("contactNum"));
		String NIC = request.getParameter("NIC");
		String Email =request.getParameter("Email");
		String PASSWORD = request.getParameter("PASSWORD");
	    String  retypePASSWORD=request.getParameter("retypePASSWORD");
	   
	    Customer c1=new Customer();
	     c1.setUID(uid);
		 c1.setName(Name);
	     c1.setAddress(Address);	
	     c1.setContactNum(contantNum);
	     c1.setNIC(NIC);
	     c1.setEmail(Email);
	     c1.setPASSWORD(PASSWORD);
	     c1.setRetypePASSWORD(retypePASSWORD);
		 doGet(request, response);
         CusService updateCustomer =new CusService();
	     updateCustomer.UpdateCustomerDetails(c1);
	     
	     RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CustomerRetrieve.jsp") ;
			dispatcher.forward(request, response);
			doGet(request, response);
		
	
	}

	

}

