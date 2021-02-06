package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Db.Db_connection;
import com.mysql.jdbc.PreparedStatement;

import Model.PastProject;
import Model.Pricing_details;

public class SearchProject {
	private static Connection connection;

	private static PreparedStatement preparedStatement;
	
	ArrayList<PastProject> projects = new ArrayList<>();
	
	ResultSet res;
	
	public ArrayList getPastProjects(PastProject Project) {
		
		
		
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");

			String sql = "select * from pastproject where Type=? AND Description LIKE ?";

			

			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"DESIGENING");
			preparedStatement.setString(2, "%" + Project.getDescription() + "%");

			res = preparedStatement.executeQuery();

			while (res.next()) {
				PastProject Searchprojects = new PastProject();
				
				String Description= res.getString("Description");
				String image =  res.getString("image");
				String Type= res.getString("Type");
				int proect_ID  =  Integer.parseInt(res.getString("proect_ID"));
				
				Searchprojects.setDescription( Description);
				Searchprojects.setImages(image);
				Searchprojects.setType(Type);
				Searchprojects.setProect_ID(proect_ID);
				
				projects.add(Searchprojects);
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	

		return projects;
	}
	public ArrayList getCivil_contructionprojects(PastProject cicilcontrucion) {
		
		
		
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");

			String sql = "select * from pastproject where 	Type=? AND Description LIKE ?";

			

			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"CIVIL CONSTRUCTION WORKES");
			preparedStatement.setString(2,"%" + cicilcontrucion.getDescription() + "%");

			res = preparedStatement.executeQuery();

			while (res.next()) {
				PastProject civili = new PastProject();
				
				String Description= res.getString("Description");
				String image =  res.getString("image");
				String Type= res.getString("Type");
				int proect_ID  =  Integer.parseInt(res.getString("proect_ID"));
				
				civili.setDescription( Description);
				civili.setImages(image);
				civili.setType(Type);
				civili.setProect_ID(proect_ID);
				
				projects.add(civili);
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	

		return projects;
	}
}
