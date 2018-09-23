
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class HandlingMySQL {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String driver = "com.mysql.jdbc.Driver"; // get the Driver
		
		Class.forName(driver).newInstance();  // initialize the driver
		//LAPTOP-JBG1MJES
		
		//String dbUrl = "jdbc:mysql://localhost:3306/mysql";
		String dbUrl = "jdbc:mysql://LAPTOP-JBG1MJES:3306/gee"; 


				
		//Connection conn = DriverManager.getConnection(dbUrl, "gprac", "root"); // connecting to the database
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gee?user=gprac&password=root"); // connecting to the database

		
		
		
		
		
		System.out.println("Connected!");
	    
		
		/*
	    Statement state = conn.createStatement();
		ResultSet rs= state.executeQuery("select * from employee");
		rs.next();
		System.out.println(rs.getString("id"));*/
		
		
		/*
		PreparedStatement statement = conn.prepareStatement("select * from employee where area =? and salary=?");
		statement.setString(1, "delhi");
		statement.setInt(2, 200);

		ResultSet rs= statement.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getString("id")+ "---" + rs.getString("name"));
		}
		*/
		
		/*
		PreparedStatement statement = conn.prepareStatement("insert into employee values (?,?,?,?)");
		statement.setInt(1, 4);
		statement.setString(2, "sahith");
		statement.setString(3, "chennai");
		statement.setInt(1, 400);

		statement.executeUpdate();
		*/
		
		/*
		PreparedStatement statement = conn.prepareStatement("delete from employee where name=?");
		statement.setString(1, "sahith");
		
		statement.executeUpdate();
		*/
		
		conn.close();
	}

	
}
