package Service;

import java.io.FileOutputStream;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Customer;
import Model.Item;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import Db.Db_connection;


public class ItemDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
		
	
	
	public static List<Item> validate(String itemcode){
		
		ArrayList<Item> cus = new ArrayList<>();
		
		try {
			con =Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from newitem where itemcode='"+itemcode+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String price = rs.getString(2);
				String discount = rs.getString(3);
				String category = rs.getString(4);
				String icode = rs.getString(5);
				
				Item c = new Item(id,price,discount,category,icode);
				cus.add(c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
	
	
	
	
	
	
	
	public static boolean insertitem(String price, String discount, String category, String itemcode ) {
		boolean isSuccess = false;
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "insert into newitem values(0,'"+price+"','"+discount+"','"+category+"','"+itemcode+"')";
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
	
	
	
	public static boolean updateitem(String id, String price, String discount, String category, String itemcode) {
		
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "update newitem set price='"+price+"',discount='"+discount+"',category='"+category+"',itemcode='"+itemcode+"'"
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
	
	
	
	public static List<Item> getItemDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Item> item = new ArrayList<>();
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "Select * from newitem where id= '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id= rs.getInt(1);
				String price = rs.getString(2);
				String discount = rs.getString(3);
				String category = rs.getString(4);
				String itemcode = rs.getString(5);
				
				Item i = new Item(id, price, discount, category, itemcode);
				item.add(i);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	
	
	public static boolean deleteItem(String id) {
		
		int convId = Integer.parseInt(id);
		
		try{
		
			con = Db_connection.getConnection();
			stmt=con.createStatement();
			
			String sql ="delete from newitem where id='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r >0) {
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
	
	
public static void generate_itempdf() {
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\user\\Desktop\\ItemAdds.pdf"));
			document.open();
			
			Paragraph para = new Paragraph("This is Item Advertisements Details");
			document.add(para);
			para.setAlignment(Paragraph.ALIGN_CENTER);
			
			Paragraph para1 = new Paragraph("                             ");
			document.add(para1);
			
			
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from newitem ";
			rs = stmt.executeQuery(sql);
			
			PdfPTable table = new PdfPTable(5);
			
			PdfPCell c1 = new PdfPCell(new Phrase("id"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("price"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("discount"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("category"));
			table.addCell(c1);
			
			c1 = new  PdfPCell(new Phrase("itemcode"));
			table.addCell(c1);
			
			
			
			while(rs.next()){

			table.addCell(rs.getString("id"));
			table.addCell(rs.getString("price"));
			table.addCell(rs.getString("discount"));
			table.addCell(rs.getString("category"));
			table.addCell(rs.getString("itemcode"));
			
			
			
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
