package com.simplilearn.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class MSQLUtils {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/simplilearn","root","manager");
		return con;
	}
	
	public void insertDataInMySql(Map<String, String> dataToInsert) throws ClassNotFoundException, SQLException {
		Connection con=getConnection();
		Statement stmt = con.createStatement();
		
		dataToInsert.forEach((t,p)->{
			System.out.println("inserted data -> "+t+"-->"+p);
			String sql = String.format("INSERT INTO amazon_data (name, price) VALUES ('%s', '%s')", t, p);

			try {
				stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		stmt.close();
		con.close();
		
	}
	
	public Map<String, String> getValuesForPriceAndTitle() throws ClassNotFoundException, SQLException{
		String sql = "SELECT name, price FROM amazon_data";

		// Connect to database
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();

		// Execute query
		ResultSet rs = stmt.executeQuery(sql);

		// Create map to store result
		Map<String, String> data = new HashMap<>();

		// Iterate over result set
		while (rs.next()) {
		  String name = rs.getString("name");
		  String price = rs.getString("price");
		  data.put(name, price);
		}

		// Close resources
		rs.close();
		stmt.close();
		conn.close();

		// Return result
		return data;
	}
	
	
		
//	try{  
//		Class.forName("com.mysql.jdbc.Driver");  
//		Connection con=DriverManager.getConnection(  
//		"jdbc:mysql://localhost:3306/simplilearn","root","manager");  
//		//here sonoo is database name, root is username and password  
//		Statement stmt=con.createStatement();  
//		ResultSet rs=stmt.executeQuery("select * from employee");  
//		while(rs.next())  
//		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//		con.close();  
//		}catch(Exception e){ System.out.println(e);}  
//		} 

}
