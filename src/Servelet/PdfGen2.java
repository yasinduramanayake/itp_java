package Servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.ItemDBUtil;


@WebServlet("/PdfGen2")
public class PdfGen2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ItemDBUtil.generate_itempdf();
		RequestDispatcher dis = request.getRequestDispatcher("newiteminsert.jsp");
		dis.forward(request, response);
	}

}
