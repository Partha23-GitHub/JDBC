package com.jdbcCrud.partha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
	public static void display() throws SQLException,ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/enterprise_java", "root", "");
			if(connection !=null) {
				Statement statement=connection.createStatement();
				if(statement !=null) {
					ResultSet result=statement.executeQuery("select sid,sname,sage,saddr from student;");
					if(result !=null) {
						System.out.println("id\t   Name\t        Age\tAddress");
						while(result.next()) {
							int sid=result.getInt(1);
							String sname=result.getString(2);
							int sage=result.getInt(3);
							String saddr=result.getString(4);
							System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddr);
						}
					}
					else {
						System.out.println("Database doesn't contain any data");
					}
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
