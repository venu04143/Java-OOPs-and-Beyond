package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL_ExceptionPractice1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// load the Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded to The Memroy");
		
		// create connection Object and establish
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		
		System.out.println("Connection Established");
		
		// create a statement
		
		Statement stmt = cn.createStatement();
		
		// executing the database using result set
		
		String sql ="select * from dept";
		
		ResultSet rs =stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getNString(2)+"\t");
			System.out.println(rs.getString(3));
			
			System.out.println("--------------------------");
		}
				

	}

}
