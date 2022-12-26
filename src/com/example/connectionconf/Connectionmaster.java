package com.example.connectionconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionmaster {
	public static Connection getconnection(){
		
		try {
			String URL="jdbc:mysql://localhost:3306/jdbcmaster";
			String usernameString="root";
			String passwordString="Pthakare@27";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL,usernameString,passwordString);
			
			return conn;
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
		
			
		
	}
}
