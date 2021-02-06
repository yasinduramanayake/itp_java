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


public class Pdf_generate2M{
	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;

	
	public void genarate_pdfCrt() {

		 try
	        {
        String fileName = "D:\\pdf\\CartItem.pdf"; 

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName));
		document.open();
		
		
		
		Paragraph para = new Paragraph("CartRETRIVE");
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		Paragraph para1 = new Paragraph("                         ");
		document.add(para1);
		
		
		
		
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");
		


		String  sql2= "select * from shopping_cart"; 

		preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);

      	res  = preparedStatement.executeQuery();

      	PdfPTable table = new PdfPTable(4);
      	
		
		PdfPCell c1;
		c1 = new  PdfPCell(new Phrase("Price"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Colours"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Quantity"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Cus_id"));
		table.addCell(c1);
		
	

		
		while(res.next()){
			
	
		table.addCell(Double.toString(res.getDouble("Price")));
		table.addCell(res.getString("colours"));
		table.addCell(Integer.toString(res.getInt("quantity")));
		table.addCell(Integer.toString(res.getInt("Cus_id")));
		
				
		
		
		}
		table.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
		document.add(table);
		
		document.close();
		
		
		System.out.println("succesfully pdf genarated");
		
	        }catch(Exception e) {
		
        System.out.println(e);
	        }
	}
}
	

		 
		 
		 
            
        
    




