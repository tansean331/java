package com.tjh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
	ArrayList<User> users;
	Connection connection = null;
	
	public UserDao() {
		// TODO Auto-generated constructor stub
		users = new ArrayList<User>();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void ConnectionClose() {
		if(null != connection)
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	/**
	 * @插入新数据
	 * @param id 主键
	 * @param first_name 姓名
	 * @param last_name
	 * @param email
	 * @param SQL 
	 */
	public void insert(String username, String password) throws SQLException {
		long starttime = System.currentTimeMillis();
			
		PreparedStatement preparedStatement = null;
		try {
			//1 注册驱动
			//2 建立连接
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			String sql = "insert into admin(username,password) values(?,?);";
			//4 创建prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			//5 设置参数
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			//6 执行SQL
			int affectrows = preparedStatement.executeUpdate();
			System.out.println("insert success! " + affectrows);
		} finally {
			// TODO: handle finally clause
			//7 关闭资源
			preparedStatement.close();
		}
		System.out.println("总用时："+ (System.currentTimeMillis() - starttime));
	}
}
