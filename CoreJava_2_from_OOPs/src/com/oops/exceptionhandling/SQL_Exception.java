package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_Exception {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("main method started");
		
		// step 1 : Loading the Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class has been Loaded to the Memory ");
		
		// step 2 : Create a Connection Object and Establish the connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		System.out.println("Connection Established !");
		
	//	Step 3: We need to create a Statement
		// Creates a Statement object for sending SQL statements to the database.

		Statement stmt =  con.createStatement();
		
		System.out.println("Statement Created.");
		
//		Step4 : Executing the DB using ResultSet
//		executeQuery(String sql)	
//		Executes the given SQL statement, which returns a single ResultSet object.
		
		String sql ="select * from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		// next() -> Moves the cursor forward one row from its current position.

		System.out.println("looping the rows");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getInt(6));
			System.out.println(rs.getInt(7));
			System.out.println(rs.getInt(8));
			System.out.println("--------------------");
		}
	}

}
