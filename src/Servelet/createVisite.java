package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.visiting_details;
import Service.visiting_services;




@WebServlet("/createVisite")
public class createVisite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Name = request.getParameter("fullname");
		String NIC = request.getParameter("NIC");
		String Email = request.getParameter("Email");
		String Phone = request.getParameter("pNum");
		String Address = request.getParameter("adres");
		String Messege = request.getParameter("message");
		
		 HttpSession session = request.getSession();
			
	if((Integer)session.getAttribute("UID") != null) {
			
			//to check session is available
			//if log or not
		
		visiting_details visit = new visiting_details();
		visit.setAddress(Address);
		visit.setName(Name);
		visit.setMessege(Messege);
		visit.setEmail(Email);
		visit.setNIc(NIC);
		visit.setpNum(Phone);
		visit.setCusid((Integer)session.getAttribute("UID"));
		
		
		
		visiting_services visitings = new visiting_services();
		visitings.InsertVisite(visit);
		
		///////////////////////////////
		
		visiting_details visitemails = new visiting_details();
		
		visitemails.setName(Name);
		visitemails.setpNum(Phone);
		
		
		visiting_services visitingsemails = new visiting_services();
		visitingsemails. sendemailtovisit(visitemails);
		
	
			RequestDispatcher dis3 = request.getRequestDispatcher("/Visiting_display.jsp");
			dis3.forward(request, response);
		
			}
	else{
		request.setAttribute("visname",Name);
    	request.setAttribute("visNic",NIC);
    	request.setAttribute("visEmail",Email);
    	request.setAttribute("vispphone",Phone);
    	request.setAttribute("visaddress",Address);
    	request.setAttribute("vismassage",Messege);
    	
    	RequestDispatcher dis3 = request.getRequestDispatcher("/checkout_visiting_login.jsp");
		dis3.forward(request, response);
	}
}

		
	
}	
		
	


	

