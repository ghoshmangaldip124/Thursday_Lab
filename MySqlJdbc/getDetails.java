//JDBC PROJECT
//@ MANGALDIP GHOSH

package com.jdbc.MySqlJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getDetails {
	public static void getdetails() {
		try(Connection conn = ConnectionSql.getDbConnection()){
			System.out.println("==========ALL STUDENT DETAILS===========");
			//sql query
			String sql="select * from student1";
			//for user input precompiled and stored in a PreparedStatement object
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			// while loop all datafetch
			while(rs.next())
			{
				System.out.println("student Id: "+rs.getInt("id"));
				System.out.println("student Name: "+rs.getString("name"));
				System.out.println("student Email: "+rs.getString("roll"));
				System.out.println("==========================================");
			}
			}catch(Exception e){
			System.out.println(e.getMessage());
			}
	}
}
