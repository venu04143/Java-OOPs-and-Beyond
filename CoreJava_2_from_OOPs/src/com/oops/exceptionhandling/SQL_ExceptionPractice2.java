package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_ExceptionPractice2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step 1 : load driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded SucessFully");
		
		// step2 : Create a connection object and establish the connection
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		System.out.println("DataBase Connnected ");
		
		// step3 create a statement 
		
		Statement stmt =cn.createStatement();
		
		// step4 executing the database using Result set
		
		String sql="select * from employee";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getString(4));
			System.out.println("------------------------");
			
		}

	}

}
