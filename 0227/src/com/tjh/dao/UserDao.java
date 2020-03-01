package com.tjh.dao;

import java.util.List;

import com.tjh.entity.User;

public interface UserDao {

	List<User> queryAllUser();
	
	User SelectUserByUserName(User user);

}

