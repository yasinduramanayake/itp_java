package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import Db.Db_connection;
import Model.cart;

public class cart_services {
	
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	public void InsertCartItem(cart c) {
	
		try {
			
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
		
			String sql  = "INSERT INTO shopping_cart (Price,colours,quantity,Cus_ID) Values(?,?,?,?)";
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		
			
			preparedStatement.setDouble(1,c.getPrice());
			preparedStatement.setString(2,c.getColours());
			preparedStatement.setInt(3,c.getQuantity());
			preparedStatement.setInt(4,c.getCus_id());
	
			
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	 
	}
	
	public void updatecartItem(cart v) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connected to db");
		
		String sql  = "UPDATE shopping_cart set Price=?,colours=?,quantity=?,Cus_ID=? where Cart_ID=?";
		preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
	
		
		preparedStatement.setDouble(1,v.getPrice());
		preparedStatement.setString(2,v.getColours());
		preparedStatement.setInt(3,v.getQuantity());
		preparedStatement.setInt(4,v.getCus_id());
		preparedStatement.setInt(5,v.getCart_id());
		
		 preparedStatement.executeUpdate();
			System.out.println("Updated Successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public void deletecartItem(cart  d) {
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql4 = "DELETE FROM  shopping_cart  where  Cart_ID=?";
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql4);
			preparedStatement.setInt(1,d.getCart_id());
		
			preparedStatement.execute();
				System.out.println("Deleted Successfully");
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	

}