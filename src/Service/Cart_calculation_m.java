package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Db.Db_connection;
import Model.cart;

public class Cart_calculation_m {
	
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	private static ResultSet result;
	 Double cartPrice;
	 int quantity;
	Double firstprice;
	Double sum=0.00;
	public Double calculateCart(cart cartcal) {
		

		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql  = "select Price,quantity FROM shopping_cart where Cus_ID =?";
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1,cartcal.getCus_id());
			
			
			
			result= preparedStatement.executeQuery();
			while(result.next()) {
				
		       cartPrice = result.getDouble("Price");
		       quantity = result.getInt("quantity");
		       
		       firstprice = cartPrice * quantity;
		       
		       sum = firstprice + sum;
		       
		       
				
				}
			result.close();

	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
		System.out.println(sum);
		
	return sum;
	

	}
}

