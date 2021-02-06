package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Db.Db_connection;

import Model.item_details;

public class Product_searchings {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	ArrayList<item_details> serachproducts = new ArrayList<>();
	
	ResultSet res ;
	
	
	public ArrayList Arrayhotelpro(item_details products) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from products where category=? AND Item_name LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Hotel");
			preparedStatement.setString(2,products.getItem_name()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				item_details Searchpro = new item_details();
				
				int p_id = res.getInt("product_id");
				String name= res.getString("Item_name");
				String description =  res.getString("description");
				String 	image =  res.getString("image");
				Double price = res.getDouble("Price");
			
				Searchpro.setProductId(p_id);
				Searchpro.setDescription(description);
				Searchpro.setItem_name(name);
				Searchpro.setImage(image);
				Searchpro.setPrice(price);
				
				
				serachproducts.add(Searchpro);
				
				
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
		
		
		
		return serachproducts;
		
	}
	public ArrayList<item_details> Arrayhousepro(item_details products) {
		ArrayList<item_details> array = new ArrayList<item_details>();
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from products where category=? AND Item_name LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"House");
			preparedStatement.setString(2,products.getItem_name()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				item_details idt = new item_details();
				
				int p_id = res.getInt("product_id");
				String name= res.getString("Item_name");
				String description =  res.getString("description");
				String 	image =  res.getString("image");
				Double price = res.getDouble("Price");
			
				idt.setPrice(price);
				idt.setProductId(p_id);
				idt.setDescription(description);
				idt.setItem_name(name);
				idt.setImage(image);
				
				System.out.println("***"+idt.getItem_name());
				
				
				
				array.add(idt);
				
				
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
		
		
		return array;
		
	}
	public ArrayList Arrayofficepro(item_details products) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from products where category=? AND Item_name LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Office");
			preparedStatement.setString(2,products.getItem_name()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				item_details Searchpro = new item_details();
				
				int p_id = res.getInt("product_id");
				String name= res.getString("Item_name");
				String description =  res.getString("description");
				String 	image =  res.getString("image");
				Double price = res.getDouble("Price");
			
				Searchpro.setProductId(p_id);
				Searchpro.setDescription(description);
				Searchpro.setItem_name(name);
				Searchpro.setImage(image);
				Searchpro.setPrice(price);
				
				
				serachproducts.add(Searchpro);
				
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
		
		
		
		return serachproducts;
		
	}
	public ArrayList Arraysofapro(item_details products) {
		ArrayList serachproducts = new ArrayList<item_details>();
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from products where category=? AND Item_name LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Sofa");
			preparedStatement.setString(2,products.getItem_name()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				item_details Searchpro = new item_details();
				
				int p_id = res.getInt("product_id");
				String name= res.getString("Item_name");
				String description =  res.getString("description");
				String 	image =  res.getString("image");
				Double price = res.getDouble("Price");
			
				Searchpro.setProductId(p_id);
				Searchpro.setDescription(description);
				Searchpro.setItem_name(name);
				Searchpro.setImage(image);
				Searchpro.setPrice(price);
				
				
				serachproducts.add(Searchpro);
				
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
		
		
		
		return serachproducts;
		
	}
	public ArrayList Arraypranteypro(item_details products) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from products where category=? AND Item_name LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Pantey&Kitchen");
			preparedStatement.setString(2,products.getItem_name()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				item_details Searchpro = new item_details();
				
				int p_id = res.getInt("product_id");
				String name= res.getString("Item_name");
				String description =  res.getString("description");
				String 	image =  res.getString("image");
				Double price = res.getDouble("Price");
			
				Searchpro.setProductId(p_id);
				Searchpro.setDescription(description);
				Searchpro.setItem_name(name);
				Searchpro.setImage(image);
				Searchpro.setPrice(price);
				
				
				serachproducts.add(Searchpro);
				
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
		
		
		
		return serachproducts;
		
	}
	public ArrayList Arraywooddenpro(item_details products) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql = "select * from products where category=? AND Item_name LIKE ?"; 
		
		
		
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"Wooden&Decking");
			preparedStatement.setString(2,products.getItem_name()+ "%");
		
			
			res  = preparedStatement.executeQuery();
			
			while(res.next()){
				item_details Searchpro = new item_details();
				
				int p_id = res.getInt("product_id");
				String name= res.getString("Item_name");
				String description =  res.getString("description");
				String 	image =  res.getString("image");
				Double price = res.getDouble("Price");
			
				Searchpro.setProductId(p_id);
				Searchpro.setDescription(description);
				Searchpro.setItem_name(name);
				Searchpro.setImage(image);
				Searchpro.setPrice(price);
				
				
				serachproducts.add(Searchpro);
				
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
		
		
		
		return serachproducts;
		
	}
}
