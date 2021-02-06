package Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;

import Db.Db_connection;
import Model.visiting_details;




public class visiting_services{

	private static Connection connection;
	private static boolean isSuccess;
	private static ResultSet rs;
	//createvisiteInsert


	//createvisiteInsert
	private static PreparedStatement preparedStatement;
	
public void InsertVisite(visiting_details v) {
	

		
		
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql  = "INSERT INTO visite(Name,NIC,Email,Phone,Address,Messege,CustomerID) values(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);

		
		
			preparedStatement.setString(1,v.getName());
			preparedStatement.setString(2,v.getNIc());
			preparedStatement.setString(3,v.getEmail());
			preparedStatement.setString(4,v.getpNum());
			preparedStatement.setString(5,v.getAddress());
			preparedStatement.setString(6,v.getMessege());
			preparedStatement.setInt(7,v.getCusid());
	


			preparedStatement.execute();
			System.out.println("inserted Successfully");
		
		
		
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
public void sendemailtovisit(visiting_details viemails) throws IOException {
	 Email from  = new Email("yasinduramanayake123@gmail.com");
     Email to = new Email("IT19164304@my.sliit.lk");
     String subject = "Sending a verification code";
     Content content =new Content("text/plain", "  You Have a new visiting request from  " + viemails.getName() + "  and also you can contact him with  " + viemails.getpNum());
     Mail mail = new Mail(from, subject, to, content);
     
     
     SendGrid sg = new SendGrid("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");
     Request request = new Request();
     try {
    	   request.setMethod(Method.POST);
           request.setEndpoint("mail/send");
           request.setBody(mail.build());

           com.sendgrid.Response response = sg.api(request);

           System.out.println(response.getStatusCode());
           System.out.println(response.getBody());
           System.out.println(response.getHeaders());
          
    	 
     }
     catch(IOException ex) {
    	 throw ex;
     }
}
	
	//validation visite id and name
public static boolean validate(String Name,String NIC){
	
	try {
		connection = Db_connection.getConnection();
		Statement stmt = connection.createStatement();
		String sql = "select * from visite where name ='"+Name+"' and nic ='"+NIC+"'";
		rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return isSuccess;	
}


//array list

public static List<visiting_details> getvisite(String Name){
		
		//create visite arraylist object
		ArrayList<visiting_details> vst = new ArrayList<>();
		
		try {
			connection = Db_connection.getConnection();
			Statement stmt = connection.createStatement();
			String sql = "select * from visite where name ='"+Name+"'";
			rs = stmt.executeQuery(sql);
			
	
			while(rs.next()) {
				int visite_id = rs.getInt(1);
				String name = rs.getString(2);
				String nic = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String address = rs.getString(6);
				String messege = rs.getString(7);
				
				//create Staff class object
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return vst;
		
	}//end of the visite check part

//update visiting
public void updatevisiting(visiting_details vi) {
	   
	   try {
		   
		 //db conection
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql  = "update visite set Name=?,NIC=?,Email=?,Phone=?,Address=?,Messege=? where visite_id=?";
			preparedStatement = connection.prepareStatement(sql);

		
		
			preparedStatement.setString(1,vi.getName());
			preparedStatement.setString(2,vi.getNIc());
			preparedStatement.setString(3,vi.getEmail());
			preparedStatement.setString(4,vi.getpNum());
			preparedStatement.setString(5,vi.getAddress());
			preparedStatement.setString(6,vi.getMessege());
			preparedStatement.setInt(7,vi.getVistiteId());


			preparedStatement.execute();
			System.out.println("updated Successfully");
		
	   }
		
	   catch(Exception e){
			e.printStackTrace();
		}
	
}//end of the update visiting part


//retrew part
public static List<visiting_details> getVisiteDetails(String VisiteId){
	   
	   //string reservId convert int data type using rapple class
	  int convertvisiteID = Integer.parseInt(VisiteId);
	   
	   
	   ArrayList<visiting_details> vdetails = new ArrayList<>();
	   
	   try {
		   connection = Db_connection.getConnection();
		   System.out.println("connect to db");
		   Statement stmt = connection.createStatement();
			
		   String sql = "select * from visite where visite_id='"+convertvisiteID+"'";
		   ResultSet rs = stmt.executeQuery(sql);
		   
		   while(rs.next()) {
			   
			    int visite_id = rs.getInt(1);
				String Name = rs.getString(2);
				String Nic = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String address = rs.getString(6);
				String message = rs.getString(7);
				
				
		   }
	   }
	   
	   catch(Exception e){
			e.printStackTrace();
		}
	   return vdetails;
}//end of the retriew visiting

//delete visite
public void deleteVisite(visiting_details delvi) {
	   

	
try {
	   connection = Db_connection.getConnection();
	   System.out.println("connect to db");
	
	   
	   String sql = "delete from visite where visite_id=?";
	
		preparedStatement = connection.prepareStatement(sql);

		
		

		preparedStatement.setInt(1,delvi.getVistiteId());


		preparedStatement.execute();
		System.out.println("deleted Successfully");
	
	
}
catch(Exception e){
		e.printStackTrace();
	}

}

//genarate pdf for visite
public static void genarate_pdf() {
	
	ArrayList<visiting_details> vst = new ArrayList<>();
	
	try {
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\kasun\\Desktop\\VisiteDeatails.pdf"));
		document.open();
		
		Paragraph par1 = new Paragraph("This is Customer's invitaion for get vistite servise");
		document.add(par1);
		par1.setAlignment(Paragraph.ALIGN_CENTER);
		
		Paragraph par2 = new Paragraph("--------------------------------");
		document.add(par2);
		
		
		connection = Db_connection.getConnection();
		Statement stmt = connection.createStatement();   
		String sql = "select * from visite ";
		rs = stmt.executeQuery(sql);
		
		PdfPTable table = new PdfPTable(7);
		
		PdfPCell c1 = new PdfPCell(new Phrase("visite_id"));
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("name"));
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("nic"));
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("email"));
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("phone"));
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("address"));
		table.addCell(c1);
		
		c1 = new PdfPCell(new Phrase("message"));
		table.addCell(c1);
		
		
		while(rs.next()){

			table.addCell(rs.getString("visite_id"));
			table.addCell(rs.getString("name"));
			table.addCell(rs.getString("nic"));
			table.addCell(rs.getString("email"));
			table.addCell(rs.getString("phone"));
			table.addCell(rs.getString("address"));
			table.addCell(rs.getString("message"));
			
			
			}
			table.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
			
			document.add(table);
			
			document.close();
	
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
}

	
}
