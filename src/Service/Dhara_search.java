package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Db.Db_connection;
import Model.Pricing_details;
import Model.Transport_details;

public class Dhara_search {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	ArrayList serachd = new ArrayList<>();
	
	ResultSet res ;
	
	
	public ArrayList Arrayda(Transport_details d) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from transport where CustomerName LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			
			preparedStatement.setString(1, d.getName()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				Transport_details Search = new Transport_details();
				String lo= res.getString("Location");
				String name =  res.getString("CustomerName");
				String method =  res.getString("PaymentMethod");
				Double dis = res.getDouble("Distance");
				Double size = res.getDouble("Street_Size");
				
				
				
				Search.setName(name);
				Search.setPaymentMethod(method);
				Search.setLocation(lo);
				Search.setDistance(dis);
				Search.setStreetsize(size);
			
			
				
				serachd.add(Search);
				
				/*serach.add(name);
				serach.add(mat);
				serach.add(lab);
				serach.add(mat_cost);
				serach.add(lab_cost);
				serach.add(discount);*/
				
				
				
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return serachd;
		
	}
}
