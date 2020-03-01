package com.tjh.service;

import java.util.List;

import com.tjh.entity.User;

public interface UserService {
	
	//获取所有User
	List<User> getAllUser();
	//接口
	boolean login(User user);
}

