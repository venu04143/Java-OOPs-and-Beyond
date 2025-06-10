package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// load the Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver Class Loaded");
		
		// establish the connection
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		
		// create statement
		
		Statement stmt = cn.createStatement();
		
		// execute result set
		
		String sql = "select * from items";
		ResultSet rs = stmt.executeQuery(sql);
		
		System.out.println("pID\tpName\tprice\tQuality");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3)+"\t");
			System.out.println(rs.getString(4));
			
			System.out.println("-------------------------------");
		}

	}

}
