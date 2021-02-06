package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Db.Db_connection;
import Model.Login_details;

public class reset_services {
	private static Connection connection;
	private static ResultSet result;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	private String code;
	private String code1;
	private String code2;
	
	
	public void  reset(Login_details re) {
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
		 
			 
			String sql  = "select PASSWORD FROM  customer where PASSWORD=?";
			preparedStatement = connection.prepareStatement(sql);
			

			preparedStatement.setString(1,re.getVerification_code());
		 
			result= preparedStatement.executeQuery();
			if(result.next()) {
				code=result.getString("PASSWORD");
			
			}result.close();
			
			
			
			 String sql1  = "select PASSWORD FROM  owner where PASSWORD=?";
				preparedStatement = connection.prepareStatement(sql1);
				

				preparedStatement.setString(1,re.getVerification_code());

				result=preparedStatement.executeQuery();
				if(result.next()) {
					 code1 =result.getString("PASSWORD");
					 
				}result.close();
				
				
				 
				 String sql2  = "select Password FROM  admin where Password=?";
					preparedStatement = connection.prepareStatement(sql2);
					

					preparedStatement.setString(1,re.getVerification_code());

					result=preparedStatement.executeQuery();
					if(result.next()) {
						code2 =result.getString("Password");
					}result.close();
					
					
		}catch(SQLException e) {
						e.printStackTrace();
					}
		
		
		
		if(re.getVerification_code().equals(code)){
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				
				String sql3 = "UPDATE customer set PASSWORD=? where PASSWORD=?";
				
					preparedStatement = connection.prepareStatement(sql3);
					
					
					preparedStatement.setString(1,re.getNew_password());
					preparedStatement.setString(2,re.getVerification_code());
					
			
					
					preparedStatement.executeUpdate();
					System.out.println("Updated Successfully");
				
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		else if(re.getVerification_code().equals(code1)){
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				
				String sql3 = "UPDATE owner set PASSWORD=? where PASSWORD=?";
				
					preparedStatement = connection.prepareStatement(sql3);
					
					
					preparedStatement.setString(1,re.getNew_password());
					preparedStatement.setString(2,re.getVerification_code());
					
			
					
					preparedStatement.executeUpdate();
					System.out.println("Updated Successfully");
				
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		else if(re.getVerification_code().equals(code2)) {
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				
				String sql3 = "UPDATE admin set Password=? where Password=?";
				
					preparedStatement = connection.prepareStatement(sql3);
					
					
					preparedStatement.setString(1,re.getNew_password());
					preparedStatement.setString(2,re.getVerification_code());
					
			
					
					preparedStatement.executeUpdate();
					System.out.println("Updated Successfully");
				
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		else {
			System.out.println("wrong verification code");
		}
			
		
	
	}
}
		
	

