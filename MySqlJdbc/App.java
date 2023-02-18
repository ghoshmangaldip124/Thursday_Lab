//JDBC PROJECT
//@ MANGALDIP GHOSH

package com.jdbc.MySqlJdbc;

import java.sql.SQLException;

public class App 
{
	// this is main method for call JVM
    public static void main( String[] args ) throws ClassNotFoundException, SQLException 
    {
    	// this is connection method
    	new ConnectionSql().getDbConnection();
    	// this is create table method
    	new CreateTale().createtale();
    	//this switch case method
    	new StudentSwitch().studentswitch();
    }
}
