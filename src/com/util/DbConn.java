package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	private static String jdbcdriver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://127.0.0.1:3306/mydb";
	
	private static String username="root";
	private static String password="stjdx315";
	
	public static Connection GetConnect(){
		Connection conn=null;
		try{
		  Class.forName(jdbcdriver);	
		  conn=DriverManager.getConnection(url,username,password);
		  
		}catch(ClassNotFoundException e){
		
		}catch(SQLException e){
		
		}
		return conn;
	}
	
	public static void CloseConnet(Connection conn){
		try{
			conn.close();
		}
		catch(SQLException e){
			System.out.print(e.getMessage());
			
		}
		
		
		
		
		
		
	}
}
