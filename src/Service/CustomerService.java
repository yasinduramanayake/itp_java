package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Db.Db_connection;

import Model.Owner;

public class CustomerService {
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	public String AddDetails(Owner o) {
		System.out.println("connect to db");
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "INSERT INTO owner(Name,Age,email,contactNum,address,WorkingExperience,PASSWORD,retypePASSWORD) Values(?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("WORKING FINE");
			System.out.println("fghh");
		
	
			//preparedStatement.setInt(1,o.getUID());
			preparedStatement.setString(1,o.getName());
			preparedStatement.setInt(2,o.getAge());
			preparedStatement.setString(3,o.getEmail());
			preparedStatement.setInt(4,o.getContactNum());
			preparedStatement.setString(5,o.getAddress());
			preparedStatement.setString(6,o.getWorkingExperience());
			preparedStatement.setString(7,o.getPASSWORD());
			preparedStatement.setString(8,o.getRetypePASSWORD());
			
			
			System.out.println("connect to db2");
			System.out.println("www");
			System.out.println("djbfdsb");
			
			preparedStatement.execute();
			System.out.println("inserted Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}
	
	public String UpdateOwnerDetails(Owner o) {
		System.out.println("connect to db");
		System.out.println("Object :"+ o.getName());
		System.out.println("id :"+ o.getUID());
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "UPDATE owner set Name = ?, Age = ?, email = ?, contactNum = ?, address = ?, WorkingExperience = ?,PASSWORD=?, retypePASSWORD =? WHERE UID = ?";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("New");
			
			
			preparedStatement.setString(1,o.getName());
			preparedStatement.setInt(2,o.getAge());
			preparedStatement.setString(3,o.getEmail());
			preparedStatement.setInt(4,o.getContactNum());
			preparedStatement.setString(5,o.getAddress());
			preparedStatement.setString(6,o.getWorkingExperience());
			preparedStatement.setString(7,o.getPASSWORD());
			preparedStatement.setString(8,o.getRetypePASSWORD());
			preparedStatement.setInt(9,o.getUID());
			
			
			System.out.println("connect to db2");
			

			preparedStatement.execute();
			System.out.println("updated Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}


	public String DeleteOwnerDetails(Owner o) {
		System.out.println("connect to db");
		System.out.println("id :"+ o.getUID());
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db1");
			
			String sql  = "DELETE FROM owner WHERE UID = ?";
			preparedStatement = connection.prepareStatement(sql);
			//connection.setAutoCommit(false);
			
			System.out.println("DELETING");
			preparedStatement.setInt(1,o.getUID());
			
			
			System.out.println("connect to db2");
			

			preparedStatement.execute();
			System.out.println("Deleted Successfully");
			System.out.println("wwww");
			//connection.commit();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		
		}

		return "sucess";
	
	}


	
}


