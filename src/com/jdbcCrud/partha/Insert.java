package com.jdbcCrud.partha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void insertData(String query)throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/enterprise_java", "root", "");
			if(connection !=null) {
				Statement statement=connection.createStatement();
				if(statement !=null) {
					statement.executeUpdate(query);
					System.out.println("Succesfully added the entry into database");
				}
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

