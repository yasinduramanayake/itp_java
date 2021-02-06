package Service;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Db.Db_connection;
import Model.Payment;

public class PaymentServise {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;

	
	
	public void insertbuyingItem(Payment bi) {
	
		
		
		try {
			connection = (Connection) Db_connection.getConnection();
			System.out.println("connect to db");
			/*
		 
			 */
			String sql  = "INSERT INTO buy_pay(Amount,credit_card_ID,Card_Name,Email,Phone_No,ccv,EX_date,Cus_id) Values(?,?,?,?,?,?,?,?)";
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		
			
			preparedStatement.setDouble(1,bi.getAmount());
			preparedStatement.setInt(2,bi. getCrdNo());
			preparedStatement.setString(3,bi.getCrdName());
			preparedStatement.setString(4,bi.getEmail());
			preparedStatement.setInt(5,bi.getPhoneNo());
			preparedStatement.setInt(6,bi.getCVV());
			preparedStatement.setString(7,bi.getEx_Date());
			preparedStatement.setInt(8,bi.getCus_id());
	
	
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
		
		public void updateBuyingItem(Payment v) {
			try {
			connection = (Connection) Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql3 = "UPDATE  buy_pay set Amount=?,credit_card_ID=?,Card_Name=?,Phone_No=?,ccv=?,EX_date=? where Email=?";
			
				preparedStatement = (PreparedStatement) connection.prepareStatement(sql3);
				
				preparedStatement.setDouble(1,v.getAmount());
				preparedStatement.setInt(2,v. getCrdNo());
				preparedStatement.setString(3,v.getCrdName());
				preparedStatement.setInt(4,v.getPhoneNo());
				preparedStatement.setInt(5,v.getCVV());
				preparedStatement.setString(6,v.getEx_Date());
				preparedStatement.setString(7,v.getEmail());
				
				preparedStatement.executeUpdate();
				System.out.println("Updated Successfully");
			
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
			public void DeleteBuyingItem(Payment u) {
				
				try {
					connection = (Connection) Db_connection.getConnection();
					System.out.println("connect to db");
					
					String sql4 = "DELETE FROM  buy_pay  where Pay_ID =?" ;
					
						preparedStatement = (PreparedStatement) connection.prepareStatement(sql4);
						
					
						preparedStatement.setInt(1,u.getP_id());
					
					
					
						preparedStatement.execute();
						System.out.println("Deleted Successfully");
					
						
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
}
