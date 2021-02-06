package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Db.Db_connection;
import Model.Buying;
import Model.cart;

public class SearchM{

	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	ArrayList Searchbuying= new ArrayList<>();
	
	
	ResultSet res ;
	
	
	public ArrayList Arraybuym(Buying b) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from buying where Item_name LIKE ?"; 
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, b.getItemName() + "%");
			res  = preparedStatement.executeQuery();
			
			
			while(res.next()){
				Buying Searchm = new Buying();
				int Buy_ID=  res.getInt("Buy_ID");
				Double price = res.getDouble("price");
				String color =  res.getString("color");
				int customer_ID= res.getInt("customer_ID");
				String Item_name =  res.getString("Item_name");
				
				Searchm.setBuyid(Buy_ID);
				Searchm.setPrice(price);
				Searchm.setColor(color);
				Searchm.setCusID(customer_ID);
				Searchm.setItemName(Item_name);
				
			
				Searchbuying.add(Searchm);

			}
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Searchbuying;
		
	}
	
	public ArrayList Arraycartm(cart a) {
		
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select *  from shopping_cart where Cart_ID =?"; 
		
		
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1,a.getCart_id());
	
		res  = preparedStatement.executeQuery();
			
			while(res.next()){
				cart SearchM = new cart();
				int Price = res.getInt("Price");
				String colours= res.getString("colours");
				int quantity = res.getInt("quantity");
				int Cus_ID = res.getInt("Cus_ID");
				int Cart_ID = res.getInt("Cart_ID");
				
				
				SearchM.setPrice(Price);
				SearchM.setColours(colours);
				SearchM.setQuantity(quantity);
				SearchM.setCus_id(Cus_ID);
				SearchM.setCart_id(Cart_ID);
				
				Searchbuying.add(SearchM);
	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Searchbuying;
	}
	}