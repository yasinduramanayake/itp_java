package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Login_details;
import Model.cart;
import Model.visiting_details;
import Service.Login_service;
import Service.cart_services;
import Service.visiting_services;

/**
 * Servlet implementation class checkout_visit_servelet
 */
@WebServlet("/checkout_visit_servelet")
public class checkout_visit_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkout_visit_servelet() {
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
		int UserIdvi= Integer.parseInt(request.getParameter("ID"));
		String Passworvi= request.getParameter("PassWord");
		String vname = request.getParameter("visname");
		String nic= request.getParameter("visNic");
		String mail = request.getParameter("visEmail");
		String phone = request.getParameter("vispphone");
		String adddress = request.getParameter("visaddress");
		String massage = request.getParameter("vismassage");
		
		Login_details checkvi = new Login_details();
		
		checkvi.setUserID(UserIdvi);
		checkvi.setPassword(Passworvi);
		
		Login_service loginvi = new Login_service();
		
		int type1 = loginvi.Login(checkvi);
		
		if(type1 == 1) {
			HttpSession session=request.getSession(true);
		      session.setAttribute("UID",UserIdvi);
	
					
		      visiting_details checkvisit = new visiting_details();
				
				
		      checkvisit.setName(vname);;
		      checkvisit.setNIc(nic);
		      checkvisit.setEmail(mail);
		      checkvisit.setCusid((Integer)session.getAttribute("UID"));
		      checkvisit.setpNum(phone);	
		      checkvisit.setAddress(adddress);
		      checkvisit.setMessege(massage);
		         
			
		      visiting_services visit_checkout = new visiting_services();
		      visit_checkout.InsertVisite(checkvisit);
		      
		      //////////////////////////////////////////
		      
		      visiting_details visitemails1 = new visiting_details();
				
				visitemails1.setName(vname);
				visitemails1.setpNum(phone);
				
				
				visiting_services visitingsemails1 = new visiting_services();
				visitingsemails1.sendemailtovisit(visitemails1);
		     
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Visiting_display.jsp") ;
				dispatcher.forward(request, response);
			
		}
		else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/loginunsuccessfull.jsp") ;
			dispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
