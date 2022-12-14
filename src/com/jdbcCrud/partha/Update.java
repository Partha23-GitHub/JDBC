package com.jdbcCrud.partha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void updateData(String query)throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/enterprise_java", "root", "");
			if(connection !=null) {
				Statement statement=connection.createStatement();
				if(statement !=null) {
					statement.executeUpdate(query);
					System.out.println("Succesfully updated the entry in database");
				}
				else {
					System.out.println("Roll entered roll number is invalid");
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
