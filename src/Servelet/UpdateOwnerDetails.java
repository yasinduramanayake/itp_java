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

@WebServlet("/UpdateOwnerDetails")
public class UpdateOwnerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateOwnerDetails() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int uid = 1;
		String Name=request.getParameter("Name");
	    int Age=Integer.parseInt(request.getParameter("Age"));
	    String Email =request.getParameter("Email");
		int contantNum=Integer.parseInt(request.getParameter("contactNum"));
	    String address=request.getParameter("address");
		String WorkingExperience=request.getParameter("WorkingExperience");
		String PASSWORD = request.getParameter("PASSWORD");
	    String  retypePASSWORD=request.getParameter("retypePASSWORD");
		  
	   Owner o1= new Owner();
	   	o1.setUID(uid);
	    o1.setName(Name);
	    o1.setAge(Age);
		o1.setEmail(Email);
		o1.setContactNum(contantNum);
		o1.setAddress(address);
		o1.setWorkingExperience(WorkingExperience);
		o1.setPASSWORD(PASSWORD);
		o1.setRetypePASSWORD(retypePASSWORD);
		doGet(request, response);
		CustomerService updateOwner =new CustomerService();
		updateOwner.UpdateOwnerDetails(o1);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ownerRtrieve(backend).jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
