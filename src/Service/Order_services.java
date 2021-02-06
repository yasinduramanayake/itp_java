package Service;

	import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Db.Db_connection;
import Model.Order;

import java.util.Calendar;
import  java.util.Date;



	public class Order_services {
		
		
		private static Connection connection;

		//private static Statement statement;
		private static PreparedStatement preparedStatement;
	
		public void buyingItem(Order or) {
		
			
			
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				/*
			 
				 */
				String sql  = "INSERT INTO ordering(Price,Quantity,Email,CustomerID) Values(?,?,?,?)";
				preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			
				
				
				
				preparedStatement.setDouble (1,or.getPrice());
				preparedStatement.setInt(2,or.getQuantity());
				preparedStatement.setString(3,or.getEmail());
				preparedStatement.setInt(4,or.getCusid());
			
				
				
				
				
			 
				preparedStatement.execute();
				System.out.println("inserted Successfully");
				//connection.commit();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		 
		}
		
		public void UpdateOrder(Order o) {
		
			
			try {
				connection = Db_connection.getConnection();
				System.out.println("connect to db");
				/*
			 
				 */
				String sql  = "UPDATE  Ordering set Quantity=? where order_ID=?";
				preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			
				
				

				preparedStatement.setInt(1,o.getQuantity());			
				preparedStatement.setInt(2,o.getOrderID());
				
				
				
				
			 
				preparedStatement.execute();
				System.out.println("updated Successfully");
				//connection.commit();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		 
			public void deleteOrder(Order or) {
				
				
				try {
					connection = Db_connection.getConnection();
					System.out.println("connect to db");
					/*
				 
					 */
					String sql  = "Delete  from Ordering where order_ID=?";
					preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
				
					
					
			
					preparedStatement.setInt(1,or.getOrderID());
					
					
					
					
				 
					preparedStatement.execute();
					System.out.println("Deleted Successfully");
					//connection.commit();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			 
			
		}
			

	}





