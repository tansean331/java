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
	 * @����������
	 * @param id ����
	 * @param first_name ����
	 * @param last_name
	 * @param email
	 * @param SQL 
	 */
	public void insert(String username, String password) throws SQLException {
		long starttime = System.currentTimeMillis();
			
		PreparedStatement preparedStatement = null;
		try {
			//1 ע������
			//2 ��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			String sql = "insert into admin(username,password) values(?,?);";
			//4 ����prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			//5 ���ò���
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			//6 ִ��SQL
			int affectrows = preparedStatement.executeUpdate();
			System.out.println("insert success! " + affectrows);
		} finally {
			// TODO: handle finally clause
			//7 �ر���Դ
			preparedStatement.close();
		}
		System.out.println("����ʱ��"+ (System.currentTimeMillis() - starttime));
	}
}
