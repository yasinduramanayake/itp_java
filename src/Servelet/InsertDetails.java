package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.CustomerService;
import Model.Owner;


@WebServlet("/InsertDetails")
public class InsertDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Name=request.getParameter("Name");
	    int Age=Integer.parseInt(request.getParameter("Age"));
	    String Email =request.getParameter("Email");
		int contantNum=Integer.parseInt(request.getParameter("contactNum"));
	    String address=request.getParameter("address");
		String WorkingExperience=request.getParameter("WorkingExperience");
		String PASSWORD = request.getParameter("PASSWORD");
	    String  retypePASSWORD=request.getParameter("retypePASSWORD");
		  
	   Owner o= new Owner();
	   
	    o.setName(Name);
	    o.setAge(Age);
		o.setEmail(Email);
		o.setContactNum(contantNum);
		o.setAddress(address);
		o.setWorkingExperience(WorkingExperience);
		o.setPASSWORD(PASSWORD);
		o.setRetypePASSWORD(retypePASSWORD);

		CustomerService owner =new CustomerService();
		owner.AddDetails(o);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/AdminDashboard.jsp");
		dispatcher.forward(request, response);
		
		

	 
	}
	}
