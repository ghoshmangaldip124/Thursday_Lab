//JDBC PROJECT
//@ MANGALDIP GHOSH

package com.jdbc.MySqlJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class getUpdate {
	public static void getupdate() {
		try(Connection conn = ConnectionSql.getDbConnection()){
			Scanner sc=new Scanner(System.in);
			System.out.println("==============UPDATE STUDENT DETAILS============");
			System.out.println("Enter the Name: ");
			String name=sc.nextLine();
			System.out.println("Enter the Roll: ");
			int roll=sc.nextInt();
			//this is update query
			String query="update student1 set name='"+name+"',roll='"+roll+"'where id=?";
			//for user input precompiled and stored in a PreparedStatement object
			PreparedStatement ps=conn.prepareStatement(query);
			System.out.println("Enter the Id :- ");
			int id=sc.nextInt();
			ps.setInt(1, id);
			//rows update count
			int row=ps.executeUpdate();
			System.out.println(row+" record update successfully");
			String sql="select * from student1 where id='"+id+"'";
			////for user input precompiled and stored in a PreparedStatement object
			PreparedStatement ps1=conn.prepareStatement(sql);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("student Id :- "+rs.getInt("id"));
				System.out.println("student Name :- "+rs.getString("name"));
				System.out.println("student Roll :- "+rs.getInt("roll"));
				System.out.println("===========================");
			}
			else
				System.out.println("id not found");
			}catch(Exception e)
			{
			System.out.println(e.getMessage());
			}
	
	}
}
