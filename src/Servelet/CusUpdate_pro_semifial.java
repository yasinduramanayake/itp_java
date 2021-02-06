package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CusUpdate_pro_semifial
 */
@WebServlet("/CusUpdate_pro_semifial")
public class CusUpdate_pro_semifial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CusUpdate_pro_semifial() {
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
		
int uid = Integer.parseInt(request.getParameter("uidq"));
		String name= request.getParameter("Name");
		String address= request.getParameter("Address");
		int contact= Integer.parseInt(request.getParameter("contactNum"));
		String NIC=request.getParameter("NIC");
		String Email= request.getParameter("Email");
		
		String Password= request.getParameter("PASSWORD");
		String repassword = request.getParameter("retypePASSWORD");

		request.setAttribute("uidiq",uid);
	request.setAttribute("cname",name);
	request.setAttribute("caddress",address);
	request.setAttribute("ccontct",contact);
	request.setAttribute("cnic",NIC);
	request.setAttribute("cemail",Email);
	request.setAttribute("cpassword",Password);
	request.setAttribute("retypecpass",repassword);
	

	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CustomerProfileEdit.jsp");
	dispatcher.forward(request, response);
		doGet(request, response);
	}

}
