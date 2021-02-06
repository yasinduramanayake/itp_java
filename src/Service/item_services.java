package Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;


import java.io.File;

import Db.Db_connection;
import Model.item_details;


public class item_services {
	
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	private FileInputStream fis;
	
	public void AddProperties(item_details i) {
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			/*
		 
			 */
			String sql  = "INSERT INTO products(image,category,Item_name,description,Price) Values(?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);

			
			/*
			File myFile = new File(i.getImage());
			
			byte[] fileContent;
			String encodedString="";
			try {
				fileContent = FileUtils.readFileToByteArray(myFile);
				encodedString = Base64.getEncoder().encodeToString(fileContent);
			} catch (IOException e) {
				e.printStackTrace();
			}
			*/

			preparedStatement.setString(1,i.getImage());
			preparedStatement.setString(2,i.getCategory());
			preparedStatement.setString(3,i.getItem_name());
			preparedStatement.setString(4,i.getDescription());
			preparedStatement.setDouble(5,i.getPrice());
		 
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	 
	}

	
	public void updateProperties(item_details u) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql3 = "UPDATE  products set image=?,category=?,Item_name=?,description=?,Price=? where product_id=?";
		
			preparedStatement = connection.prepareStatement(sql3);

			System.out.println("======");
			System.out.println(u.getImage());
			System.out.println("======");
			
			File myFile = new File(u.getImage());
			
			byte[] fileContent;
			String encodedString="";
			try {
				fileContent = FileUtils.readFileToByteArray(myFile);
				encodedString = Base64.getEncoder().encodeToString(fileContent);
			} catch (IOException e) {
				encodedString = u.getImage();
			}

			preparedStatement.setString(1,encodedString);
			preparedStatement.setString(2,u.getCategory());
			preparedStatement.setString(3,u.getItem_name());
			preparedStatement.setString(4,u.getDescription());
			preparedStatement.setDouble(5,u.getPrice());
			preparedStatement.setInt(6,u.getProductId());
	
			preparedStatement.executeUpdate();
			System.out.println("Updated Successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
	
	
	public void deleteProperties(item_details d) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connect to db");
		
		String sql3 = "DELETE from  products where product_id=?";
		
			preparedStatement = connection.prepareStatement(sql3);
			
			
			preparedStatement.setInt(1,d.getProductId());
				
			preparedStatement.executeUpdate();
			System.out.println("Deleted Successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
