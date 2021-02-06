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

public class tranport_pdf_service {
	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;

	
	public void genarate_pdf() {

		 try
	        {
        String fileName = "D:\\pdf\\Transport details.pdf"; 

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName));
		document.open();
		
		
		
		Paragraph para = new Paragraph("Transport details");
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		Paragraph para1 = new Paragraph("                         ");
		document.add(para1);
		
		
		
		
		connection = (Connection)Db_connection.getConnection();
		System.out.println("connect to db");
		


		String  sql2= "select * from transport"; 

		preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);

      	res  = preparedStatement.executeQuery();

      	PdfPTable table = new PdfPTable(4);
      	table.setTotalWidth(500);
     
      	
		PdfPCell c1 = new PdfPCell(new Phrase("Location"));
		
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Distance"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Street_Size"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("PaymentMethod"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
	
		
		
		while(res.next()){

		table.addCell(res.getString("Location"));
		
		table.addCell(Double.toString(res.getDouble("Distance")));
		table.addCell(Double.toString(res.getDouble("Street_Size")));
		table.addCell(res.getString("PaymentMethod"));
		
		
		
		
		
		}
		table.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
	
		document.add(table);
		
		document.close();
		
		
		System.out.println("succes pdf genarated");
		
		
		
	        }catch(Exception e) {
		
        System.out.println(e);
	        }
	}
}
