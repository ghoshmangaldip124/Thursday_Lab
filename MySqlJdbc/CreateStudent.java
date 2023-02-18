//JDBC PROJECT
//@ MANGALDIP GHOSH

package com.jdbc.MySqlJdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

//insert data in table
public class CreateStudent {
	public static void createstudent() {
	try(Connection conn = ConnectionSql.getDbConnection())
	{
		System.out.println("===========ENTER STUDENT DETAILS============");
		Scanner sc=new Scanner(System.in);
		
		//sql query
		String sql="insert into student1 values(?,?,?)";
		// Execute query
		PreparedStatement ps=conn.prepareStatement(sql);
		//for user input precompiled and stored in a PreparedStatement object
		System.out.println("Enter the Id :- ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name :- ");
		String name=sc.nextLine();
		System.out.println("Enter the Roll :- ");
		int roll=sc.nextInt();
		//database row 1,2,3
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, roll);
		//row  count
		int r=ps.executeUpdate();
		System.out.println(r+" record inserted successfully");
		}catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
}
