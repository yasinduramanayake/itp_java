package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import Db.Db_connection;
import Model.Pricing_details;

public class pricing_services {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	
	
	
	
	
	public void AddProperties(Pricing_details p) {
	
		
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
	
			
			String sql  = "INSERT INTO price_property(type,discount,labour_cost,MAterial_cost,labour,material,ItemName)Values(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql); 
			

			
			preparedStatement.setString(1,p.getType());
			preparedStatement.setDouble (2,p.getDiscount());
			preparedStatement.setDouble(3,p.getLab_cost());
			preparedStatement.setDouble(4,p.getMat_cost());
			preparedStatement.setString(5,p.getLabours());
			preparedStatement.setString(6,p.getMaterial());
			preparedStatement.setString(7, p.getName());
			
			
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}              
		
		
	 
	}
	public void updateProperties(Pricing_details o) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql3 = "UPDATE  price_property set type=?,discount=?,labour_cost=?,MAterial_cost=?,labour=?,material=? where Property_ID=?";
		
			preparedStatement = connection.prepareStatement(sql3);
			
			
			preparedStatement.setString(1,o.getType());
			preparedStatement.setDouble(2,o.getDiscount());
			preparedStatement.setDouble(3,o.getLab_cost());
			preparedStatement.setDouble (4,o.getMat_cost());
			preparedStatement.setString(5,o.getLabours());
			preparedStatement.setString(6,o.getMaterial());
			preparedStatement.setInt(7,o.getPid());
		
	
		
			
			preparedStatement.executeUpdate();
			System.out.println("Updated Successfully");
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void DeleteProperties(Pricing_details D) {
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql4 = "DELETE FROM  price_property  where  Property_ID =?";
			
				preparedStatement = connection.prepareStatement(sql4);
				
				
				
				preparedStatement.setInt(1,D.getPid());
			    
		
				
				preparedStatement.execute();
				System.out.println("Deleted Successfully");
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public Double calculate(Pricing_details q) {
		
		Double mat_cost;
		Double lab_cost;
		Double prime_cost;
		Double overhead;
		Double profit;
		Double discount;
		Double price;
		Double finalPrice;
		
		mat_cost = q.getMat_cost();
		lab_cost = q.getLab_cost();
		discount = q.getDiscount();
		
		
		
		prime_cost = mat_cost + lab_cost;
		
	overhead = prime_cost * 30/100;
		profit = ((prime_cost + overhead) * 20/100);
		
		price = profit - discount;
		
		return price;
		
		
	}
	
}




