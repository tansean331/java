package com.tjh.mclass;

import java.sql.*;
import java.util.*;


public class MysqlDemo {
	
	ArrayList<Employees> employees;
	Connection connection = null;
	
	public MysqlDemo() {
		// TODO Auto-generated constructor stub
		employees = new ArrayList<Employees>();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < employees.size(); i++)
		{
			System.out.println(employees.get(i).id + "\t" + employees.get(i).first_name + "\t" + employees.get(i).last_name + "\t" + employees.get(i).email);
			
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
	public void insert(int employee_id, String first_name, String last_name, String email) throws SQLException {
		long starttime = System.currentTimeMillis();
			
		PreparedStatement preparedStatement = null;
		try {
			//1 ע������
			//2 ��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			//3 ����SQL
			String sql = "insert into employees(employee_id,first_name,last_name,email) values(?,?,?,?)";
			//4 ����prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			//5 ���ò���
			preparedStatement.setInt(1, employee_id);
			preparedStatement.setString(2, first_name);
			preparedStatement.setString(3, last_name);
			preparedStatement.setString(4, email);
			//6 ִ��SQL
			int affectrows = preparedStatement.executeUpdate();
			System.out.println("affectrows:" + affectrows);
		} finally {
			// TODO: handle finally clause
			//7 �ر���Դ
			preparedStatement.close();
		}
		System.out.println("����ʱ��"+ (System.currentTimeMillis() - starttime));
	}
	
	/**
	 * @�޸�����
	 * @param id ����
	 * @param first_name ����
	 * @param last_name
	 * @param email
	 * @param SQLException 
	 */
	
	public void updata(int id, String first_name, String last_name, String email)throws SQLException{
		long starttime = System.currentTimeMillis();
		
		PreparedStatement preparedStatement = null;
		try {
			//1 ע������
			//2 ��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			//3 ����SQL
			String sql = "update employees set first_name=?,last_name=?,email=? where employee_id = ?";
			//4 ����prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			//5 ���ò���
			preparedStatement.setString(1, first_name);
			preparedStatement.setString(2, last_name);
			preparedStatement.setString(3, email);
			preparedStatement.setInt(4, id);
			//6 ִ��SQL
			int affectrows = preparedStatement.executeUpdate();
			System.out.println("affectrows:" + affectrows);
		} finally {
			// TODO: handle finally clause
			//7 �ر���Դ
			preparedStatement.close();
		}
		System.out.println("����ʱ��"+ (System.currentTimeMillis() - starttime));
	}
	
	
	/**
	 * @ɾ������
	 * @param id ����
	 * @param SQLException 
	 */
	public void delete(int id)throws SQLException{
		long starttime = System.currentTimeMillis();
		
		PreparedStatement preparedStatement = null;
		try {
			//1 ע������
			//2 ��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			//3 ����SQL
			String sql = "delete from employees where employee_id = ?";
			//4 ����prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			//5 ���ò���
			preparedStatement.setInt(1, id);
			//6 ִ��SQL
			int affectrows = preparedStatement.executeUpdate();
			System.out.println("affectrows:" + affectrows);
		} finally {
			// TODO: handle finally clause
			//7 �ر���Դ
			preparedStatement.close();
		}
		System.out.println("����ʱ��"+ (System.currentTimeMillis() - starttime));
	}
	
	/**
	 * @��ѯ����
	 * @param id ����
	 * @param SQLException 
	 */
	
	public void select(int id)throws SQLException{
		long starttime = System.currentTimeMillis();
		this.employees.clear();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			//1 ע������
			//2 ��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			//3 ����SQL
			String sql = "select employee_id,first_name,last_name,email from employees where employee_id = ?;";
			//4 ����prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			//6 ִ��SQL
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Employees employee = new Employees(
						resultSet.getInt("employee_id"),
						resultSet.getString("first_name"),
						resultSet.getString("last_name"),
						resultSet.getString("email")
						);
				this.employees.add(employee);
			}
		} finally {
			// TODO: handle finally clause
			//7 �ر���Դ
			preparedStatement.close();
		}
		System.out.println("����ʱ��"+ (System.currentTimeMillis() - starttime));
	}
	
	/**
	 * @��ѯ���м�¼
	 * @param id ����
	 * @param SQLException 
	 */
	
	public void selectAll()throws SQLException{
		long starttime = System.currentTimeMillis();
		this.employees.clear();
		
		PreparedStatement preparedStatement = null;
		Connection	connection = null;
		ResultSet resultSet = null;
		try {
			//1 ע������
			//2 ��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/neuedu?", "root", "123456");
			//3 ����SQL
			String sql = "select employee_id,first_name,last_name,email from employees";
			//4 ����prepaerStatement
			preparedStatement = connection.prepareStatement(sql);
			//6 ִ��SQL
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Employees employee = new Employees(
						resultSet.getInt("employee_id"),
						resultSet.getString("first_name"),
						resultSet.getString("last_name"),
						resultSet.getString("email")
						);
				this.employees.add(employee);
			}
		} finally {
			// TODO: handle finally clause
			//7 �ر���Դ
			preparedStatement.close();
		}
		System.out.println("����ʱ��"+ (System.currentTimeMillis() - starttime));
	}
	
}
