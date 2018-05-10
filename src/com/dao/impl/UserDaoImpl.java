package com.dao.impl;

import com.dao.UserDao;
import com.model.User;
import java.sql.*;
import com.util.DbConn;

public class UserDaoImpl implements UserDao {
	private Connection conn=DbConn.GetConnect();	
	  public boolean isLogin(User user){
		  boolean flag=false;
		  String sql="select * from loginuser where username=? and password=?";
		  
		 try{
			 if(conn==null){
				 System.out.println("conn is null");
				 }
		  PreparedStatement pmst=conn.prepareStatement(sql);
		  pmst.setString(1, user.getUsername());
		  pmst.setString(2, user.getPassword());
		  ResultSet rs=pmst.executeQuery();
		  if(rs.next()){
				flag=true;				
			}
		
		  
		 }catch (SQLException e){
			 e.printStackTrace();
		 }
		   
		  return flag;
		
	}

}
