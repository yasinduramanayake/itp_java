package Service;

import java.io.FileOutputStream;
import java.sql.ResultSet;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StatementImpl;

import Db.Db_connection;

public class Pdf_generateV {


	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;

	
	public void genarate_pdfv() {

		 try
	        {
        String fileName = "D:\\varani\\Ordering.pdf"; 

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName));
		document.open();
		
		
		
		Paragraph para = new Paragraph("Orders");
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		Paragraph para1 = new Paragraph("                         ");
		document.add(para1);
		
		
		
		
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");
		


		String  sql2= "select * from ordering"; 

		preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);

      	res  = preparedStatement.executeQuery();

      	PdfPTable tablev = new PdfPTable(4);
      	
		PdfPCell cv = new PdfPCell(new Phrase("CusId"));
		
		tablev.addCell(cv);
		
		cv = new  PdfPCell(new Phrase("Quantity"));

		tablev.addCell(cv);
		
		cv = new  PdfPCell(new Phrase("Price"));
		
		tablev.addCell(cv);
		
		cv = new  PdfPCell(new Phrase("Emails"));

		tablev.addCell(cv);
		
		
		
		
		
		while(res.next()){

		tablev.addCell(Integer.toString(res.getInt("CustomerID")));
		tablev.addCell(Integer.toString(res.getInt("Quantity")));
		tablev.addCell(Double.toString(res.getDouble("Price")));
		tablev.addCell(res.getString("Email"));
		
		
		
		
		
		
		}
		tablev.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
		document.add(tablev);
		
		document.close();
		
		
		System.out.println("succes pdf genarated");
		
		
		
	        }catch(Exception e) {
		
        System.out.println(e);
	        }
	}

}
