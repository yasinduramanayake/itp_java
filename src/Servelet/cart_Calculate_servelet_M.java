package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.cart;
import Service.Cart_calculation_m;


/**
 * Servlet implementation class cart_Calculate_servelet_M
 */
@WebServlet("/cart_Calculate_servelet_M")
public class cart_Calculate_servelet_M extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cart_Calculate_servelet_M() {
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
		String radio = request.getParameter("valuesc");

		
		
	
		
		HttpSession session = request.getSession();
		if((Integer)session.getAttribute("UID") != null) {
			
		
		cart calcu12 = new cart();
		
		
		 
		 
		calcu12.setCus_id((Integer)session.getAttribute("UID"));
		Cart_calculation_m cart_cal = new  Cart_calculation_m();
		
		Double cartprice = cart_cal.calculateCart(calcu12);
		
		
		  if (radio.equals("Yes")) {
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/insert_trans.jsp") ;
		dispatcher.forward(request, response);
		
		}
		else if(radio.equals("No")) {
			request.setAttribute("calResult",cartprice);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/unsucess_m.jsp");
			dispatcher.forward(request, response);		
		}
		
		
		}else {
		
			request.setAttribute("radio",radio);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/newLoginPage_calculate.jsp") ;
			dispatcher.forward(request, response);
		
	}
		doGet(request, response);
		}
	}

