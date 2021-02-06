package Service;

import java.io.FileOutputStream;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import Db.Db_connection;

import Model.Customer_pamudi;


public class CustomerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Customer_pamudi> validate1(String registerid){
		
		ArrayList<Customer_pamudi> cus = new ArrayList<>();
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customerdetails where registerid='"+registerid+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String category = rs.getString(2);
				String fullName = rs.getString(3);
				String phone = rs.getString(4);
				String email = rs.getString(5);
				String regid = rs.getString(6);
				
				Customer_pamudi c = new Customer_pamudi(id,category,fullName,phone,email,regid);
				cus.add(c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
	
	
	
	
	
	
	
	public static boolean insertcustomer(String category, String fullName, String phone, String email, String registerid ) {
		boolean isSuccess = false;
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "insert into customerdetails values(0,'"+category+"','"+fullName+"','"+phone+"','"+email+"','"+registerid+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess=true;
			}else {
				isSuccess=false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updatecustomer(String id, String category, String fullName, String phone, String email, String registerid) {
		
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "update customerdetails set category='"+category+"',fullName='"+fullName+"',phone='"+phone+"',email='"+email+"',registerid='"+registerid+"'"
					+ "where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	
	public static List<Customer_pamudi> getCustomerDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Customer_pamudi> cus = new ArrayList<>();
		
			try {
				con = Db_connection.getConnection();
				stmt = con.createStatement();
				String sql = "select * from customerdetails where id='"+convertedID+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt(1);
					String category = rs.getString(2);
					String fullName = rs.getString(3);
					String phone = rs.getString(4);
					String email = rs.getString(5);
					String registerid = rs.getString(6);
					
					Customer_pamudi c = new Customer_pamudi(id,category,fullName,phone,email,registerid);
					cus.add(c);
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return cus;
	}
	
	public static boolean deleteInvitation(String id) {
		
		int convId = Integer.parseInt(id);
		
		try {
			
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customerdetails where id='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static void generate_pdf() {
		
		ArrayList<Customer_pamudi> cus = new ArrayList<>();
		
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\user\\Desktop\\Invitations.pdf"));
			document.open();
			
			Paragraph para = new Paragraph("This is Customer's Invitations");
			document.add(para);
			para.setAlignment(Paragraph.ALIGN_CENTER);
			
			Paragraph para1 = new Paragraph("                             ");
			document.add(para1);
			
			
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customerdetails ";
			rs = stmt.executeQuery(sql);
			
			PdfPTable table = new PdfPTable(6);
			
			PdfPCell c1 = new PdfPCell(new Phrase("id"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("category"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("fullName"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("phone"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("email"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("registerid"));
			table.addCell(c1);
			
			
			
			while(rs.next()){

			table.addCell(rs.getString("id"));
			table.addCell(rs.getString("category"));
			table.addCell(rs.getString("fullName"));
			table.addCell(rs.getString("phone"));
			table.addCell(rs.getString("email"));
			table.addCell(rs.getString("registerid"));
			
			
			}
			table.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
			
			document.add(table);
			
			document.close();
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
	
	


	
	
	

}
