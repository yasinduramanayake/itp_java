package Service;

import java.io.FileOutputStream;
import java.sql.ResultSet;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Db.Db_connection;


public class Pdf_generateM{
	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;

	
	public void genarate_pdf() {

		 try
	        {
        String fileName = "D:\\pdf\\BuyItem.pdf"; 

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName));
		document.open();
		
		
		
		Paragraph para = new Paragraph("buyRETRIVE");
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		Paragraph para1 = new Paragraph("                         ");
		document.add(para1);
		
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");

		String  sql2= "select * from buying"; 

		preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);

      	res  = preparedStatement.executeQuery();

      	PdfPTable table = new PdfPTable(3);
		PdfPCell c1 = new PdfPCell(new Phrase("price"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("color"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("customer_ID"));
		table.addCell(c1);
		

		
		
		
		while(res.next()){

		table.addCell(res.getString("color"));
		table.addCell(Double.toString(res.getDouble("price")));
		table.addCell(Integer.toString(res.getInt("customer_ID")));
				
		
		
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
	

		 
		 
		 
            
        
    




