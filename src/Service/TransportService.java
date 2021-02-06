package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Db.Db_connection;
import Model.Transport_details;

public class TransportService {

	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;

	
	public void AddTransport(Transport_details t) {
	
		
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
		 
			 String sql  = "INSERT INTO transport(Location,Distance,Street_Size,CustomerName,PaymentMethod)Values(?,?,?,?,?)";
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			

			
			preparedStatement.setString(1,t.getLocation());
			preparedStatement.setDouble(2,t.getDistance());
			preparedStatement.setDouble(3,t.getStreetsize());
			preparedStatement.setString(4,t.getName());
			preparedStatement.setString(5,t.getPaymentMethod());
			
			
		preparedStatement.execute();
		System.out.println("inserted Successfully");
		
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}
	public void updateTransport(Transport_details td) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "UPDATE transport set  Location=?,Distance=?,Street_Size=?,PaymentMethod=? where CustomerName=?";
		
			preparedStatement = connection.prepareStatement(sql);
			
			
		    preparedStatement.setString(1,td.getLocation());
		    preparedStatement.setDouble(2,td.getDistance());
		    preparedStatement.setDouble(3,td.getStreetsize());
		    preparedStatement.setString(4,td.getPaymentMethod());
		    preparedStatement.setString(5,td.getName());
			
			preparedStatement.executeUpdate();
			System.out.println("Updated Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}	
	
public void DeleteTrans(Transport_details t) {
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql4 = "DELETE FROM  transport  where CustomerName=?";
			
				preparedStatement = (PreparedStatement)connection.prepareStatement(sql4);
				
				
				 preparedStatement.setString(1,t.getName());
			    
			    preparedStatement.execute();
				System.out.println("Deleted Successfully");
			
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}}
