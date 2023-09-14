package com.ranjeet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	public static Connection connectMYSQL() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/license","root","manager");
		
		if(conn==null)
		{
			System.out.println("connection Failed");
		}
		else
		{
			System.out.println("connection Succeed");
		}
		return conn;

	}


}
