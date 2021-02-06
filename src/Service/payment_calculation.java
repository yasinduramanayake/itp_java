package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Db.Db_connection;
import Model.Payment;

public class payment_calculation {

	Connection connection;
	 
	PreparedStatement preparedStatement;

		
	 ResultSet res ;
	 
	 Double sum = 0.00;
	
	public Double Amountmaking(Payment sith){
		try {
			
			connection = (Connection) Db_connection.getConnection();
			System.out.println("connect to db");
			
		String  sql2= "select Amount from buy_pay where Cus_id=?"; 

	
			preparedStatement =(PreparedStatement) connection.prepareStatement(sql2);
			preparedStatement.setInt(1,sith.getCus_id());

      	res  = preparedStatement.executeQuery();
      	
      	
      	while(res.next()){

    	    Double Amount = res.getDouble("Amount");
    		
    	sum = Amount + sum;
      	
      	
		} 
      	res.close();
		}
     		catch (SQLException e) {
      	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
		
		return sum;
	}
}
