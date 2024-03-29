package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.pdf.AcroFields.Item;

import Service.ItemDBUtil;


@WebServlet("/DeleteItemServlet")
public class DeleteItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = ItemDBUtil.deleteItem(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("newiteminsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			List<Model.Item> itemDetails = ItemDBUtil.getItemDetails(id);
			request.setAttribute("itemDetails", itemDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("itemdetails.jsp");
			dispatcher.forward(request, response);
		}
	}

}
