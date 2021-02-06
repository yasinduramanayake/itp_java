 package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Db.Db_connection;
import Model.Buying;
import Model.cart;

public class buying_services {
	
	private static Connection connection;

	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	public void insertbuyingItem(Buying b) {
	
		   
        try {
            connection = Db_connection.getConnection();
            System.out.println("connected to db");
       
            String sql  = "INSERT INTO buying(price,color,customer_ID,Item_name) Values(?,?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
       
            preparedStatement.setDouble(1,b.getPrice());
            preparedStatement.setString(2,b.getColor());
            preparedStatement.setInt(3,b.getCusID());
            preparedStatement.setString(4,b.getItemName());
           
            preparedStatement.execute();
            System.out.println("inserted Successfully");
            //connection.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    
	 
	}
	
	
	public void updatebuyingItem(Buying y) {
		try {
		connection = Db_connection.getConnection();
		System.out.println("connected to db");
		
		
		String sql = "UPDATE buying set price=?,color=?,customer_ID=?,Item_name=? where Buy_ID=?";
		preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
	
		preparedStatement.setDouble (1,y.getPrice());
		preparedStatement.setString(2,y.getColor());
		preparedStatement.setInt(3,y.getCusID());
		preparedStatement.setString(4,y.getItemName());
		preparedStatement.setInt(5,y.getBuyid());
		
		
		 preparedStatement.executeUpdate();
			System.out.println("Updated Successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public void deletebuyingItem(Buying d) {
		
		try {
			connection = Db_connection.getConnection();
			System.out.println("connect to db");
			
			String sql4 = "DELETE FROM  buying  where 	Buy_ID=?";
			
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql4);
			preparedStatement.setInt(1,d.getBuyid());
		
			preparedStatement.execute();
				System.out.println("Deleted Successfully");	
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
	

}
