package Service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.mysql.fabric.Response;
import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;

import Db.Db_connection;
import Model.Login_details;
import java.util.Random;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.objects.*;


public class Login_service {
	
	
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	private static ResultSet result;
	private int type;
	private String PassWord;
	private String PassWord1;
	private String PassWord2;
	private String email;
	private String email1;
	private String email2;
	int min = 5000000;
    int max = 1000000;
    int random_int;
 
	
	public int Login(Login_details L) {
 

    

		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
		 
			 
			String sql  = "select PASSWORD FROM  customer where UID=?";
			preparedStatement = connection.prepareStatement(sql);
			

			preparedStatement.setInt(1,L.getUserID());
		 
			result= preparedStatement.executeQuery();
			if(result.next()) {
		            PassWord=result.getString("PASSWORD");
			
			}result.close();
			
			
			
			 String sql1  = "select PASSWORD FROM  owner where UID=?";
				preparedStatement = connection.prepareStatement(sql1);
				

				preparedStatement.setInt(1,L.getUserID());

				result=preparedStatement.executeQuery();
				if(result.next()) {
					 PassWord1 =result.getString("PASSWORD");
					 
				}result.close();
				
				
				 
				 String sql2  = "select Password FROM  admin where UID=?";
					preparedStatement = connection.prepareStatement(sql2);
					

					preparedStatement.setInt(1,L.getUserID());

					result=preparedStatement.executeQuery();
					if(result.next()) {
						PassWord2 =result.getString("Password");
					}
					result.close();
					
				
			
				if(L.getPassword().equals(PassWord) ) {
					
					type = 1;
					
					
				 }
				 else if(L.getPassword().equals(PassWord1)){
					
					type = 2;
							 }
							 else if(L.getPassword().equals(PassWord2) ){
								
										
											
											type = 3;
										 }
							else{
									type = 4;
								}
									
						
							
				 
	
						
				 
			
	
								 
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return type;
	}
	
	
	
	
	public void sendemail(Login_details E) throws IOException {
		 random_int = (int)(Math.random() * (max - min + 1) + min);
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
	 
		 
		String sql0  = "select Email FROM  customer where UID=? AND Name=?";
		
			preparedStatement = connection.prepareStatement(sql0);
		
		

		preparedStatement.setInt(1,E.getUserID());
		preparedStatement.setString(2,E.getName());
		
	 
		result= preparedStatement.executeQuery();
		if(result.next()) {
			
			email =result.getString("Email"); 
			
		System.out.println("hy");
		}
		result.close();
		
		
		
		String sql5  = "select Email FROM  owner where UID=? AND Name=?";
		
		preparedStatement = connection.prepareStatement(sql5);
	
	

	preparedStatement.setInt(1,E.getUserID());
	preparedStatement.setString(2,E.getName());
	
 
	result= preparedStatement.executeQuery();
	if(result.next()) {
		
		email1 =result.getString("Email"); 
		
	System.out.println("hy");
	}
	result.close();
	
	
	
	
	String sql6  = "select Email FROM  admin where UID=? AND Name=?";
	
	preparedStatement = connection.prepareStatement(sql6);



                    preparedStatement.setInt(1,E.getUserID());
                         preparedStatement.setString(2,E.getName());


              result= preparedStatement.executeQuery();
                   if(result.next()) {
	
	                   email2 =result.getString("Email"); 
	
                  
             }
                          result.close();


	
	
		
		
		
		
		if(E.getEmail().equals(email)) {
			
			
			
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				
				String sql3 = "UPDATE customer set PASSWORD=? where UID=?";
				
					preparedStatement = connection.prepareStatement(sql3);
					
					
					preparedStatement.setString(1,Integer.toString(random_int));
					preparedStatement.setInt(2,E.getUserID());
					
			
					
					preparedStatement.executeUpdate();
					System.out.println("Updated Successfully");
				
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
			
			
			  //Creating a result for getting status that messsage is delivered or not!
                     Email from  = new Email("yasinduramanayake123@gmail.com");
                     Email to = new Email(email);
                     String subject = "Sending a verification code";
                     Content content =new Content("text/plain", "Your verification code is   " + random_int  + ".  please Don't forget your verification code  " + ".    Thanks for dealing with us. Have a good Day!   ");
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
                     
			
		}else if(E.getEmail().equals(email1)) {
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				
				String sql3 = "UPDATE owner set PASSWORD=? where UID=?";
				
					preparedStatement = connection.prepareStatement(sql3);
					
					
					preparedStatement.setString(1,Integer.toString(random_int));
					preparedStatement.setInt(2,E.getUserID());
					
			
					
					preparedStatement.executeUpdate();
					System.out.println("Updated Successfully");
				
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
			
			
			  //Creating a result for getting status that messsage is delivered or not!
			Email from  = new Email("yasinduramanayake123@gmail.com");
            Email to = new Email(email1);
            String subject = "Sending a verification code";
            Content content =new Content("text/plain", "Your verification code is   " + random_int  + ".  please Don't forget your verification code  " + ".    Thanks for dealing with us. Have a good Day!   ");
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
		else if(E.getEmail().equals(email2)){
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				
				String sql3 = "UPDATE admin set Password=? where UID=?";
				
					preparedStatement = connection.prepareStatement(sql3);
					
					
					preparedStatement.setString(1,Integer.toString(random_int));
					preparedStatement.setInt(2,E.getUserID());
					
			
					
					preparedStatement.executeUpdate();
					System.out.println("Updated Successfully");
				
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			
			
			
			
			  //Creating a result for getting status that messsage is delivered or not!
			Email from  = new Email("yasinduramanayake123@gmail.com");
            Email to = new Email(email2);
            String subject = "Sending a verification code";
            Content content =new Content("text/plain", "Your verification code is   " + random_int  + ".  please Don't forget your verification code  " + ".    Thanks for dealing with us. Have a good Day!   ");
            
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
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

	



		
		
	


