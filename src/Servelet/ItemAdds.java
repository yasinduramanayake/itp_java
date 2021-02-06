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


@WebServlet("/ItemAdds")
public class ItemAdds extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemcode = request.getParameter("icode");
		
		try {
			List<Model.Item> iDetails = ItemDBUtil.validate(itemcode);
			request.setAttribute("iDetails", iDetails);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis4 = request.getRequestDispatcher("ItemAdds.jsp");
		dis4.forward(request, response);
		
	}

}
