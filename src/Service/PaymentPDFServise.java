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


import Db.Db_connection;
public class PaymentPDFServise {
	

	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;

	
	public void genarate_pdf() {

		 try
		 {
        String fileName = "D:\\sithmi\\Payment Details.pdf"; 

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName));
		document.open();
		
		
		
		Paragraph para = new Paragraph("Payments");
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		Paragraph para12 = new Paragraph("                         ");
		document.add(para12);
		
		
		
		
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");
		


		String sql23= "select * from buy_pay "; 

		preparedStatement =(PreparedStatement) connection.prepareStatement(sql23);

      	res  = preparedStatement.executeQuery();

      	PdfPTable table123 = new PdfPTable(5);
		PdfPCell c23 = new PdfPCell(new Phrase("Pay ID"));
	
		
		table123.addCell(c23);
		
		c23 = new  PdfPCell(new Phrase("Customer Name"));
		
		table123.addCell(c23);
		
		c23 = new  PdfPCell(new Phrase("Phone Number"));

		table123.addCell(c23);
		
		c23 = new  PdfPCell(new Phrase("Email"));

		table123.addCell(c23);
		
		c23 = new  PdfPCell(new Phrase("Amount"));
	
		table123.addCell(c23);
	        
	

		

		
		
		
		while(res.next()){

		table123.addCell(Integer.toString(res.getInt("Pay_ID")));
		table123.addCell(res.getString("Card_Name"));
		table123.addCell(Integer.toString(res.getInt("Phone_No")));
		table123.addCell(res.getString("Email"));
		table123.addCell(Double.toString(res.getDouble("Amount")));
		
		}
		
		table123.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
		document.add(table123);
		
		document.close();
		
		
		System.out.println("succes pdf genarated");
		
		
		
	        }catch(Exception e) {
		
        System.out.println(e);
	        }
	}
}
	



