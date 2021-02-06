package Servelet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Service.Pdf_generateM;
import Service.Pdf_generate;

import java.io.*;
 import java.awt.*;
/**
 * Servlet implementation class ppdf_genM
 */
@WebServlet("/ppdf_genM")
public class ppdf_genM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ppdf_genM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Pdf_generateM pdf = new Pdf_generateM();
		pdf.genarate_pdf();
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/buyRETRIVE.jsp") ;
		dispatcher.forward(request, response);
		doGet(request, response);
	}

}
