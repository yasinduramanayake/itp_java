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

/**
 * Servlet implementation class CustomerInsert
 */
@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 

	 String Name=request.getParameter("Name");
	 String address=request.getParameter("Address");
	 int contantNum=Integer.parseInt(request.getParameter("contactNum"));
	 String NIC = request.getParameter("NIC");
	 String Email =request.getParameter("Email");
	 String PASSWORD = request.getParameter("PASSWORD");
	 String  retypePASSWORD=request.getParameter("retypePASSWORD");
	 
	 
	
	 Customer c=new Customer();
	 c.setName(Name);
     c.setAddress(address);	
     c.setContactNum(contantNum);
     c.setNIC(NIC);
     c.setEmail(Email);
     c.setPASSWORD(PASSWORD);
     c.setRetypePASSWORD(retypePASSWORD);
	  
     
    
     
     CusService Customer =new CusService();
     Customer.AddDetails(c);
     
     
     Customer c1 = new Customer();
     c1.setPASSWORD(PASSWORD);
     c1.setEmail(Email);
     c1.setNIC(NIC);
     
    CusService Displayid = new CusService();
     Displayid.displayID(c1);
     
     
     RequestDispatcher dispacher=request.getRequestDispatcher("/Login.jsp");
	 dispacher.forward(request, response);
	 
		
	}

}
