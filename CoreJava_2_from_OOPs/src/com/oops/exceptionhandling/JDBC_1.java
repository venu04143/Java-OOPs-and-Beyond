package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// step 1 : load the Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded Sucessfully");
		
		// step2 : Create the Connection Object and Establish the Connection
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		System.out.println("Connection Established");
		
		// step 3 : create the statement
		
		Statement stmt = cn.createStatement();
		
		// steep 4 : Execute the Result set 
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
