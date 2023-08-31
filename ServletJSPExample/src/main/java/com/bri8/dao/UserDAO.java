package com.bri8.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {

	String jdbcUrl = "jdbc:mysql://localhost:3306/student";
	String dbUsername = "root";
	String dbPassword = "root";
	
	public String isUserFound(String userName, String password) {
		
		String userFound=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");   
			Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE username = '" + userName
					+ "' AND password = '" + password + "'");

			if (resultSet.next()) {
				userFound = resultSet.getString("name");
			    
			} 

			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return userFound;
	}
	
	
	public String addUser(String username, String password, String name) {
		//1. insert query
		
		try {
			Class.forName("com.mysql.jdbc.Driver");   
			Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
			Statement statement = connection.createStatement();
			boolean isAdded= statement.execute("INSERT INTO users (username, password, name) VALUES "
					+ "('" + username + "', '"+password+"','"+ name+"');");

			
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return name;
	}
}
