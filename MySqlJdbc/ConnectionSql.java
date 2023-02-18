//JDBC PROJECT
//@ MANGALDIP GHOSH

package com.jdbc.MySqlJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql
//load and register the driver ---> com.jdbc.
//create connection

public class ConnectionSql {
	//this is static con variable
	static Connection conn=null;
	public static Connection getDbConnection()
			throws ClassNotFoundException, SQLException {
		
		// // url & database details
		String url="jdbc:mysql://localhost:3306/demo";
		// MySQL user name
		String username = "root";
		//// MySQL password
		String password = "root";
		// Driver name
		Class.forName("com.mysql.cj.jdbc.Driver");
		// connection
		Connection conn = DriverManager.getConnection(
	            url, username, password);
		return conn;
	}
}
