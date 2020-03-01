package com.tjh.dao;

import java.util.List;

import com.tjh.entity.User;

public interface UserDao {

	// 添加数据
	int addOneUser(User user);
	
	// 判断用户是否存在
	boolean checkUserIsExists(User user);
	boolean checkUserNameIsExists(String username);
	
	//检索全部用户
	List<User> getAllUsers();
	
	//删除用户
	int removeUser(int id);
	
	//
	int updataID(int id, String username, String password, String regdate);
}
