package com.tjh.service;

import java.util.List;

import com.tjh.entity.User;

public interface UserService {
	
	//��ȡ����User
	List<User> getAllUser();
	//�ӿ�
	boolean login(User user);
}

