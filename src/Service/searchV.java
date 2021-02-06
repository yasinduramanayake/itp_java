package Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Db.Db_connection;
import Model.Order;
import Model.Pricing_details;

public class searchV {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	ArrayList serachorder = new ArrayList<>();
	
	ResultSet res ;
	
	
	public ArrayList Arrayordering(Order ords) {
		try {
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from ordering where Price > ?"; 
		
		
		
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			preparedStatement.setDouble(1,ords.getPrice());
			
			
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				Order ordarray = new Order();
				
				int CusId= res.getInt("CustomerID");
				int quantity =  res.getInt("Quantity");
				String email =  res.getString("Email");
				Double price = res.getDouble("Price");
				
				
				
				ordarray.setCusid(CusId);
				ordarray.setQuantity(quantity);
				ordarray.setEmail(email);
				ordarray.setPrice(price);
				
				serachorder.add(ordarray);
				
				/*serach.add(CusId);
				serach.add(Quantity);
				serach.add(Email);
				serach.add(Price);
			
				*/
				
				
				
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return serachorder;
		
	}
}
