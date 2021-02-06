package Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.Connection;
import Db.Db_connection;
import Model.Payment;
public class SearchPaymentService {
	
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	ArrayList serachsithmi123 = new ArrayList<>();
	
	ResultSet res ;
	
	
	public ArrayList Arraypayment(Payment PS) {
		try {
		connection = (Connection) Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from buy_pay where 	Amount > ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
		
			preparedStatement.setDouble(1, PS.getAmount());
			
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				
			Payment Searchsithmi = new Payment();
			
				int  P_id =  res.getInt("Pay_ID");
				String CrdName =  res.getString("Card_Name");
				double Amount = res.getDouble("Amount");
				String emil =  res.getString("Email");
				int PhoneNo = res.getInt("Phone_No");
				
				
				Searchsithmi.setP_id(P_id);
				Searchsithmi.setCrdName(CrdName);
				Searchsithmi. setAmount(Amount);
				Searchsithmi.setEmail(emil);
				Searchsithmi.setPhoneNo(PhoneNo);
				
				serachsithmi123.add(Searchsithmi);
				
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return serachsithmi123;
		
	}}
