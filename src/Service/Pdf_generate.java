package Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.sql.ResultSet;

import javax.imageio.IIOException;
import javax.swing.text.StyleConstants.ColorConstants;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Db.Db_connection;


public class Pdf_generate{
	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;

	
	public void genarate_pdf() {

		 try
	        {
        String fileName = "D:\\pdf\\Pricing_properties.pdf"; 

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(fileName));
		document.open();
		
		
		
		Paragraph para = new Paragraph("Pricing Properties");
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(para);
		
		Paragraph para1 = new Paragraph("                         ");
		document.add(para1);
		
		
		
		
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");
		


		String  sql2= "select * from price_property "; 

		preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);

      	res  = preparedStatement.executeQuery();

      	PdfPTable table = new PdfPTable(7);
      	
     
      	
		PdfPCell c1 = new PdfPCell(new Phrase("IteName"));
		
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Materials"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Materieal cost"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Labours"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Labour cost"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Discount"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("Item_type"));
		c1.setBackgroundColor(BaseColor.GREEN);
		table.addCell(c1);
		
		
		  
		
		
		double sum1=0;
		double sum2=0;
		double sum3=0;
		int count =0;
		
		while(res.next()){

		table.addCell(res.getString("ItemName"));
		table.addCell(res.getString("material"));
		table.addCell("RS: " + Double.toString(res.getDouble("MAterial_cost")));
		table.addCell(res.getString("labour"));
		table.addCell("RS: " + Double.toString(res.getDouble("labour_cost")));
		table.addCell("RS: " + Double.toString(res.getDouble("discount")));
		table.addCell(res.getString("type"));
		
		double mati = res.getDouble("MAterial_cost");
		sum1 = mati + sum1;
		
		double labi=res.getDouble("labour_cost");
		sum2 = labi + sum2;
		
		
		double disi = res.getDouble("discount");
		sum3= disi + sum3;
		
		//double discount=res.getDouble("discount");
		
		count = count + 1;
		
		
		
		
		}
		
		table.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
	
		document.add(table);
		Paragraph para2 = new Paragraph("          ");
		document.add(para2);
		
		
		
		
		PdfPTable table1 = new PdfPTable(2);
		
        PdfPCell c2 = new PdfPCell(new Phrase("number of Items"));
		c2.setBackgroundColor(BaseColor.GREEN);
		table1.addCell(c2);
		
		c2 = new  PdfPCell(new Phrase("Full cost expences for all items"));
		c2.setBackgroundColor(BaseColor.GREEN);
		table1.addCell(c2);
		
		
		table1.addCell(Integer.toString(count));
		table1.addCell("RS. " + Double.toString(sum1+sum2+sum3));
		
		table1.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(table1);
		
		/*Font f = new Font(FontFamily.TIMES_ROMAN, 20.0f, Font.BOLD, BaseColor.BLACK);
		Paragraph para3= new Paragraph("Full cost which you have expenced for item is=RS:" + Double.toString(sum1+sum2+sum3),f);
		
		para3.setAlignment(Paragraph.ALIGN_CENTER);
		
		
		document.add(para3);*/
		
		document.close();
		
		
		System.out.println("succes pdf genarated");
		
		
		
	        }catch(Exception e) {
		
        System.out.println(e);
	        }
	}
}
	

		 
		 
		 
            
        
    




