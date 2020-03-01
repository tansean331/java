package com.tjh.dao;

import java.sql.SQLException;

public class mMain {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		try {
			userDao.insert("123", "1234567");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userDao.ConnectionClose();
	}
}
