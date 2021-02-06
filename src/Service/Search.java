package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Db.Db_connection;
import Model.Pricing_details;

public class Search {

	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	ArrayList serach = new ArrayList<>();
	
	ResultSet res ;
	
	
	public ArrayList Array(Pricing_details S) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select Property_ID,ItemName,material,MAterial_cost,labour,labour_cost,discount from price_property where 	type=? AND ItemName LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Hotel");
			preparedStatement.setString(2, S.getName()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				Pricing_details Search = new Pricing_details();
				String name= res.getString("ItemName");
				String mat =  res.getString("material");
				String lab =  res.getString("labour");
				Double mat_cost = res.getDouble("MAterial_cost");
				Double lab_cost = res.getDouble("labour_cost");
				Double discount = res.getDouble("discount");
				int id = res.getInt("Property_ID");
				
				Search.setName(name);
				Search.setMaterial(mat);
				Search.setLabours(lab);
				Search.setMat_cost(mat_cost);
				Search.setLab_cost(lab_cost);
				Search.setDiscount(discount);
				Search.setItemNO(id);
				
				serach.add(Search);
				
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
		
		
		
		return serach;
		
	}
	public ArrayList Array1(Pricing_details A) {
		
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select Property_ID,ItemName,material,MAterial_cost,labour,labour_cost,discount from price_property where 	type=? AND ItemName LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Office");
			preparedStatement.setString(2, A.getName()+ "%");
			
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				Pricing_details Search = new Pricing_details();
				String name= res.getString("ItemName");
				String mat =  res.getString("material");
				String lab =  res.getString("labour");
				Double mat_cost = res.getDouble("MAterial_cost");
				Double lab_cost = res.getDouble("labour_cost");
				Double discount = res.getDouble("discount");
				int id = res.getInt("Property_ID");
				
				Search.setName(name);
				Search.setMaterial(mat);
				Search.setLabours(lab);
				Search.setMat_cost(mat_cost);
				Search.setLab_cost(lab_cost);
				Search.setDiscount(discount);
				Search.setItemNO(id);
				
				serach.add(Search);
				
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
		
		
		
		return serach;
	}
	public ArrayList Array2(Pricing_details Sofa) {
		
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select Property_ID,ItemName,material,MAterial_cost,labour,labour_cost,discount from price_property where 	type=? AND ItemName LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Sofa");
			preparedStatement.setString(2, Sofa.getName()+ "%");
			
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				Pricing_details Search = new Pricing_details();
				String name= res.getString("ItemName");
				String mat =  res.getString("material");
				String lab =  res.getString("labour");
				Double mat_cost = res.getDouble("MAterial_cost");
				Double lab_cost = res.getDouble("labour_cost");
				Double discount = res.getDouble("discount");
				int id = res.getInt("Property_ID");
				
				Search.setName(name);
				Search.setMaterial(mat);
				Search.setLabours(lab);
				Search.setMat_cost(mat_cost);
				Search.setLab_cost(lab_cost);
				Search.setDiscount(discount);
				Search.setItemNO(id);
				
				serach.add(Search);
				
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
		
		
		
		return serach;
	}
	public ArrayList Array3(Pricing_details Pantey) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select Property_ID,ItemName,material,MAterial_cost,labour,labour_cost,discount from price_property where 	type=? AND ItemName LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Pantey&Kitchen");
			preparedStatement.setString(2, Pantey.getName()+ "%");
			
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				Pricing_details Search = new Pricing_details();
				String name= res.getString("ItemName");
				String mat =  res.getString("material");
				String lab =  res.getString("labour");
				Double mat_cost = res.getDouble("MAterial_cost");
				Double lab_cost = res.getDouble("labour_cost");
				Double discount = res.getDouble("discount");
				int id = res.getInt("Property_ID");
				
				Search.setName(name);
				Search.setMaterial(mat);
				Search.setLabours(lab);
				Search.setMat_cost(mat_cost);
				Search.setLab_cost(lab_cost);
				Search.setDiscount(discount);
				Search.setItemNO(id);
				
				serach.add(Search);
				
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
		
		
		
		return serach;
	}
	public ArrayList Array4(Pricing_details Household) {
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql = "select Property_ID,ItemName,material,MAterial_cost,labour,labour_cost,discount from price_property where 	type=? AND ItemName LIKE ?"; 
			
			
			
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1,"HouseHold");
				preparedStatement.setString(2, Household.getName()+ "%");
				
				
				res  = preparedStatement.executeQuery();
				
				while(res.next()){
					Pricing_details Search = new Pricing_details();
					String name= res.getString("ItemName");
					String mat =  res.getString("material");
					String lab =  res.getString("labour");
					Double mat_cost = res.getDouble("MAterial_cost");
					Double lab_cost = res.getDouble("labour_cost");
					Double discount = res.getDouble("discount");
					int id = res.getInt("Property_ID");
					
					Search.setName(name);
					Search.setMaterial(mat);
					Search.setLabours(lab);
					Search.setMat_cost(mat_cost);
					Search.setLab_cost(lab_cost);
					Search.setDiscount(discount);
					Search.setItemNO(id);
					
					serach.add(Search);
					
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
			
			
			
			return serach;
	}
	public ArrayList Array5(Pricing_details Wooden) {
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql = "select Property_ID,ItemName,material,MAterial_cost,labour,labour_cost,discount from price_property where 	type=? AND ItemName LIKE ?"; 
			
			
			
				preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1,"Wooden&Decking");
				preparedStatement.setString(2, Wooden.getName()+ "%");
				
				
				res  = preparedStatement.executeQuery();
				
				while(res.next()){
					Pricing_details Search = new Pricing_details();
					String name= res.getString("ItemName");
					String mat =  res.getString("material");
					String lab =  res.getString("labour");
					Double mat_cost = res.getDouble("MAterial_cost");
					Double lab_cost = res.getDouble("labour_cost");
					Double discount = res.getDouble("discount");
					int id = res.getInt("Property_ID");
					
					Search.setName(name);
					Search.setMaterial(mat);
					Search.setLabours(lab);
					Search.setMat_cost(mat_cost);
					Search.setLab_cost(lab_cost);
					Search.setDiscount(discount);
					Search.setItemNO(id);
					
					serach.add(Search);
					
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
			
			
			
			return serach;
	}
}
