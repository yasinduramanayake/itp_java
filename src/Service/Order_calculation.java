package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Db.Db_connection;
import Model.Order;


public class Order_calculation {
	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;
	 
	 Double Amount = 0.00;
	 
	 Double fullorders;
	
	public Double ordersumming(Order varani){
		try {
			
			connection = (Connection) Db_connection.getConnection();
			System.out.println("connect to db");
			
		String  sql2= "select Price,Quantity from ordering where CustomerID=?"; 

	
			preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);
			preparedStatement.setInt(1,varani.getCusid());

      	res  = preparedStatement.executeQuery();
      	
      	
      	while(res.next()){

    	    Double price = res.getDouble("Price");
    	    int quantity = res.getInt("Quantity");
    	    fullorders = price * quantity;
    		
    	    Amount = fullorders + Amount;
      	
      	
		} 
      	res.close();
		}
     		catch (SQLException e) {
      	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Amount);
		
		return Amount;
	}
}

