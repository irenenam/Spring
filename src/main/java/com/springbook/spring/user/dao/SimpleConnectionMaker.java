package com.springbook.spring.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection c = DriverManager.getConnection(
				"jdbc:postgresql://localhost/postgres", "postgres", "postgres");
		
		return c;
	}
}
