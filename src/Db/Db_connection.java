package Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_connection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/m&m", "root", "");
			if (!con.isClosed())
				System.out.println("Successfully connected to MYSQL server...");
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		} 		
		return con;
	}
}
