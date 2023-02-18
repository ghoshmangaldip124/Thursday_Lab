package com.jdbc.MySqlJdbc;
import java.sql.Connection;
import java.sql.Statement;

public class CreateTale {
	public static void createtale() {
		try(Connection conn = ConnectionSql.getDbConnection())
		{
			Statement stmt = conn.createStatement();
			String sql="create table student(id int primary key,name varchar(50),roll int)";
	         stmt.executeUpdate(sql);
	         System.out.println("Created table in given database..."); 
		}catch(Exception e){
			System.out.println(e.getMessage());
			}
	}
}
