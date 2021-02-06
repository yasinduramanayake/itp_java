package Service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import Db.Db_connection;
import Model.PastProject;
import Model.Pricing_details;

public class PastProjectService {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	static ResultSet res;
	
	private FileInputStream fis;
	ArrayList serachPastprojects = new ArrayList<>();
	
	public void AddDetails(PastProject p) {
		System.out.println("connect to db");
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			String sql  = "INSERT INTO pastproject(Description,Type,image) Values(?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			preparedStatement.setString(1,p.getDescription());
			preparedStatement.setString(2,p.getType());
			preparedStatement.setString(3,p.getImages());
			
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			System.out.println("wwww");
			//connection.commit();
			
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public String updatePastProject(PastProject p) {
		
		System.out.println("connect to db");
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			System.out.println("njfkk");
			String sql  = "UPDATE pastproject set Description = ?,Type =?,image =? where proect_ID=?";
			preparedStatement = connection.prepareStatement(sql);
			
			//connection.setAutoCommit(false);
			
			
			preparedStatement.setString(1,p.getDescription());
			preparedStatement.setString(2,p.getType());
			preparedStatement.setString(3,p.getImages());
			preparedStatement.setInt(4,p.getProect_ID());
			
			preparedStatement.execute();
			System.out.println("update Successfully");
			System.out.println("wwww");
			
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}

public String DeletePastProject(PastProject p) {
	
	System.out.println("connect to db");
	System.out.println("id :" + p.getProect_ID());
	try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db1");
		String sql2  = "DELETE FROM pastproject where proect_ID =?";
		preparedStatement = connection.prepareStatement(sql2);
		
		//connection.setAutoCommit(false);

		preparedStatement.setInt(1,p.getProect_ID());
		
		
		preparedStatement.execute();
		System.out.println("delete Successfully");
		System.out.println("wwww");
		//connection.commit();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	
	}

	return "sucess";

}
public static void generate_pdf() {
	
	try {
		
		 //System.out.println("jfkgbkdfbjk");
		//System.out.println("bdhfgkhghkgk");
		Document document= new Document();
		
		System.out.println("hjrkherjkhf");
		
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\User\\Desktop\\ITPpdf\\pastporjectDetails.pdf"));
	
		//System.out.println("hjrkherjkhf");
		document.open();
		//System.out.println("hjrkherjkhf");
		Paragraph para = new Paragraph("                                           M&M PRPDUCTIONS                   ");
		document.add(para);
		para.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para1 = new Paragraph("                204/A, ST.SEBESTION ROAD,KATUWAPITIYA,NEGOMBO,(123870) ");
		document.add(para1);
		para1.setAlignment(Paragraph.ALIGN_CENTER);
		
		Paragraph para2 = new Paragraph("            Contact:+94774690899,+94312220799,Email:Sammanif1@gmail.com ");
		document.add(para2);
		para2.setAlignment(Paragraph.ALIGN_CENTER);
		
		Paragraph para3 = new Paragraph( "                                  ");
        document.add(para3);
		para3.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para4 = new Paragraph("                                        PASTPROJECT HISTORY REPORT                                ");
		document.add(para4);
		para4.setAlignment(Paragraph.ALIGN_CENTER);
		
		Paragraph para5 = new Paragraph("                                      ");
		document.add(para5);
		para5.setAlignment(Paragraph.ALIGN_CENTER);
		
		System.out.println("dhjgdjgfjdgj");
		connection = Db_connection.getConnection();
		
		
		String sql="Select * from pastproject ";
		preparedStatement = connection.prepareStatement(sql);
		res=preparedStatement.executeQuery();
		System.out.println("dhjgd");
		PdfPTable table = new PdfPTable(3);
		
		PdfPCell c1 = new PdfPCell(new Phrase("proect_ID"));
		table.addCell(c1);
		
		c1= new PdfPCell(new Phrase("Description"));
		table.addCell(c1);
		
		c1= new PdfPCell(new Phrase("Type"));
		table.addCell(c1);
		
		
		while(res.next()) {
			table.addCell(res.getString("proect_ID"));
			table.addCell(res.getString("Description"));
			table.addCell(res.getString("Type"));
			
		}
		
		table.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
		document.add(table);
		document.close();
		
		System.out.println("succes pdf genarated");
	}catch(Exception e) {
		e.printStackTrace();
	}
	}


	
}


