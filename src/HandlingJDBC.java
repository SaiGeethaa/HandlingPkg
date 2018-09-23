
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class HandlingJDBC {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-JBG1MJES:1433;user=sa;password=geesql;database=Gee");
					
		System.out.println("Connected!");
	    
        Statement s1 = conn.createStatement();

        ResultSet rs = s1.executeQuery("SELECT * FROM employee");

        while(rs.next())
		{
			System.out.println(rs.getString("id")+ "---" + rs.getString("name")+ "---" + rs.getString("area")+ "---" + rs.getString("salary"));
		}
		
		
		
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
