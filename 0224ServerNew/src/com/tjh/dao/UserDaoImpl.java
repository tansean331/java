package com.tjh.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.tjh.entity.User;
import com.tjh.util.DBUtils;

/**
 * 用户dao实现
 * @author 86470
 * @Date 2020/02/24
 */

public class UserDaoImpl implements UserDao{

	@Override
	public int addOneUser(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "INSERT INTO admin(username,password,regdate) VALUES (?,?,NOW())";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // 执行sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}

	@Override
	public boolean checkUserIsExists(User user) {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setString(1, user.getUserName());
		   prepareStatement.setString(2, user.getPassWord());
		    // 执行sql
		   ResultSet rs = prepareStatement.executeQuery();
		   if(rs.next()) {
			   User user2 = new User(rs.getInt("id"),
					   	rs.getString("username"),
					   	rs.getString("password"),
					   	rs.getDate("regdate")
					   );
			   System.out.println(user2);
			   return true;
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return false;
	}
	
	@Override
	public boolean checkUserNameIsExists(String username) {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM admin WHERE username = ?";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setString(1, username);
		    // 执行sql
		   ResultSet rs = prepareStatement.executeQuery();
		   if(rs.next()) {
			   return true;
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return false;
	}
	
	@Override
	public List<User> getAllUsers() {
		Connection connection = DBUtils.getConnection();
		String sql = "SELECT * FROM admin";
		ArrayList<User> users = new ArrayList<User>();
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 执行sql
		   ResultSet rs = prepareStatement.executeQuery();
		   
		   while(rs.next()) 
		   {
			  User user = new User(rs.getInt("id"),
					   	rs.getString("username"),
					   	rs.getString("password"),
					   	rs.getDate("regdate")
					   );
			   users.add(user);
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return users;
	}

	@Override
	public int removeUser(int id) {
		Connection connection = DBUtils.getConnection();
		String sql = "DELETE FROM admin WHERE ID=?";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setInt(1, id);
		    // 执行sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}

	@Override
	public int updataID(int id, String username, String password, String regdate) {
		Connection connection = DBUtils.getConnection();
		String sql = "update admin set username =?,password=? WHERE id=?";
		PreparedStatement prepareStatement = null;
		try {
			//  预编译sql语句
		   prepareStatement = connection.prepareStatement(sql);
		    // 给占位符赋值
		   prepareStatement.setString(1, username);
		   prepareStatement.setString(2, password);
		   prepareStatement.setInt(3, id);
		    // 执行sql
		   int executeUpdate = prepareStatement.executeUpdate();
		   return executeUpdate;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(null, prepareStatement, connection);
		}
		return 0;
	}


	

}
