package com.tjh.dao;

import java.util.List;

import com.tjh.entity.User;

public interface UserDao {

	// �������
	int addOneUser(User user);
	
	// �ж��û��Ƿ����
	boolean checkUserIsExists(User user);
	boolean checkUserNameIsExists(String username);
	
	//����ȫ���û�
	List<User> getAllUsers();
	
	//ɾ���û�
	int removeUser(int id);
	
	//
	int updataID(int id, String username, String password, String regdate);
}
