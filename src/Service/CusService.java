package Service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;

import Db.Db_connection;

import Model.Customer;
import Model.Owner;


public class CusService {
	private static ResultSet result;
			
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	String uniquePW;
	String email1;
	
	public String AddDetails(Customer c) {
		System.out.println("connect to db");
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "INSERT INTO customer(Name,Address,contactNum,NIC,Email,PASSWORD,retypePASSWORD) Values(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("WORKING FINE");
			//preparedStatement.setInt(1,c.getUID());
			preparedStatement.setString(1,c.getName());
			preparedStatement.setString(2,c.getAddress());
			preparedStatement.setInt(3,c.getContactNum());
			preparedStatement.setString(4,c.getNIC());
			preparedStatement.setString(5,c.getEmail());
			preparedStatement.setString(6,c.getPASSWORD());
			preparedStatement.setString(7,c.getRetypePASSWORD());
			
			System.out.println("connect to db2");
			
			System.out.println("connect to db2");
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}
	
	public void displayID(Customer Display1d) throws IOException {
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
		 
			 
			String sql  = "select UID,Email FROM  customer where PASSWORD=? AND NIC=?";
			preparedStatement = connection.prepareStatement(sql);
			

			preparedStatement.setString(1,Display1d.getPASSWORD());
			preparedStatement.setString(2,Display1d.getNIC());
		 
			result= preparedStatement.executeQuery();
			if(result.next()) {
				uniquePW=result.getString("UID");
				email1=result.getString("Email");
			
			}result.close();
	
		if(Display1d.getEmail().equals(email1)) {
			 Email from  = new Email("yasinduramanayake123@gmail.com");
             Email to = new Email(email1);
             String subject = "Sending a verification code";
             Content content =new Content("text/plain", "You Have successfully registered to the M@M furnitures.. Your ID is "   + uniquePW  + " Thanks for dealing with us. Have a good Day!   ");
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
		else {
			System.out.println("wrong email");
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public String UpdateCustomerDetails(Customer  c) {
		System.out.println("connect to db");
		System.out.println("Object :"+ c.getName());
		System.out.println("id :"+ c.getUID());
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "UPDATE customer set Name = ?, Address = ?,contactNum = ? ,NIC = ? ,Email = ? ,PASSWORD = ? ,retypePASSWORD = ? WHERE UID = ?";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("New");
			System.out.println("sammani");
			
			preparedStatement.setString(1, c.getName());
			preparedStatement.setString(2, c.getAddress());
			preparedStatement.setInt(3,c.getContactNum());
			preparedStatement.setString(4, c.getNIC());
			preparedStatement.setString(5, c.getEmail());
			preparedStatement.setString(6,c.getPASSWORD());
			preparedStatement.setString(7,c.getRetypePASSWORD());
			preparedStatement.setInt(8,c.getUID());
			
			System.out.println("sammani");
			System.out.println("connect to db2");
			

			preparedStatement.execute();
			System.out.println("updated Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}

	public String DeleteCustomerDetails(Customer c) {
		System.out.println("connect to db");
		System.out.println("id :"+ c.getUID());
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "DELETE FROM customer WHERE UID = ?";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("DELETING");
			preparedStatement.setInt(1,c.getUID());
		
			
			System.out.println("connect to db2");
			

			preparedStatement.execute();
			System.out.println("Deleted Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}



}




