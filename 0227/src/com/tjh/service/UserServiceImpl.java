package com.tjh.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;

import com.tjh.entity.User;

import com.tjh.dao.UserDao;
import com.tjh.util.SqlSessionFactoryUtils;

public class UserServiceImpl implements UserService{

	//
	@Override
	public List<User> getAllUser() {
		SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
		SqlSession openSession = sqlSessionFac.openSession();
		UserDao mapper = openSession.getMapper(UserDao.class);
		List<User> queryAllUser = mapper.queryAllUser();
		return queryAllUser;
	}

	//service�ӿ�ʵ�֣�����dao��
	@Override
	public boolean login(User user) {
		
		// 1. ����SqlSessionFactoryUtil����
		SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
		
		// 2. ����SqlSession���󣬴�SqlSessionFactory�л�ȡ
		SqlSession openSession = sqlSessionFac.openSession();
		
		// 3. ��Dao�ӿ� ���� userdao����
		UserDao mapper = openSession.getMapper(UserDao.class);
		
		// 4. dao��������ݿⷽ��
		User loginUser = mapper.SelectUserByUserName(user);
		if(loginUser != null)
		{
			return true;
		}
		return false;
	}
}
