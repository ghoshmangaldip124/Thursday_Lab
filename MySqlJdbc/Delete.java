//JDBC PROJECT
//@ MANGALDIP GHOSH
package com.jdbc.MySqlJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Delete {
	public static void delete() {
	try(Connection conn = ConnectionSql.getDbConnection()){
		Scanner sc=new Scanner(System.in);
		System.out.println("=============DELETE STUDENT DETAILS===========");
		//delete query
		String sql="delete from student1 where id=?";
		//for user input precompiled and stored in a PreparedStatement object
		PreparedStatement ps=conn.prepareStatement(sql);
		System.out.println("Enter the Id :- ");
		int id=sc.nextInt();
		ps.setInt(1, id);
		//delete row count
		int row=ps.executeUpdate();
		System.out.println(row+" record deleted successfully");
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
}
