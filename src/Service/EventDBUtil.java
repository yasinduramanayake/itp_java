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
import Model.Event;

public class EventDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Event> validate2(String eventcode){
		
		ArrayList<Event> cus = new ArrayList<>();
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from newevent where eventcode='"+eventcode+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String category = rs.getString(4);
				String eventCode = rs.getString(5);
				
				Event c = new Event(id,title,description,category,eventCode);
				cus.add(c);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	}

	
	public static boolean insertevent(String title, String description, String category, String eventcode ) {
		boolean isSuccess = false;
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "insert into newevent values(0,'"+title+"','"+description+"','"+category+"','"+eventcode+"')";
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
	

	public static boolean updateevent(String id, String title, String description, String category, String eventcode) {
		
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "update newevent set title='"+title+"',description='"+description+"',category='"+category+"',eventcode='"+eventcode+"'"
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
	
	
	public static List<Event> getEventDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Event> event = new ArrayList<>();
		
		try {
			con = Db_connection.getConnection();
			stmt = con.createStatement();
			String sql = "Select * from newevent where id= '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id= rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String category = rs.getString(4);
				String eventcode = rs.getString(5);
				
				Event i = new Event(id, title, description, category, eventcode);
				event.add(i);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return event;
	}
	
	
	public static boolean deleteEvent(String id) {
		
		int convId = Integer.parseInt(id);
		
		try{
		
			con = Db_connection.getConnection();
			stmt=con.createStatement();
			
			String sql ="delete from newevent where id='"+convId+"'";
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
	
	
	public static void generate_eventpdf() {
	
	ArrayList<Customer_pamudi> cus = new ArrayList<>();
	
	try {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\user\\Desktop\\EventAdds.pdf"));
		document.open();
		
		Paragraph para = new Paragraph("This is Event Advertisements Details");
		document.add(para);
		para.setAlignment(Paragraph.ALIGN_CENTER);
		
		Paragraph para1 = new Paragraph("                             ");
		document.add(para1);
		
		
		con = Db_connection.getConnection();
		stmt = con.createStatement();
		String sql = "select * from newevent ";
		rs = stmt.executeQuery(sql);
		
		PdfPTable table = new PdfPTable(5);
		
		PdfPCell c1 = new PdfPCell(new Phrase("id"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("title"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("description"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("category"));
		table.addCell(c1);
		
		c1 = new  PdfPCell(new Phrase("eventcode"));
		table.addCell(c1);
		
		
		
		while(rs.next()){

		table.addCell(rs.getString("id"));
		table.addCell(rs.getString("title"));
		table.addCell(rs.getString("description"));
		table.addCell(rs.getString("category"));
		table.addCell(rs.getString("eventcode"));
		
		
		
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
