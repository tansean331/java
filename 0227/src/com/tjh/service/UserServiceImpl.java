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

	//service接口实现，访问dao层
	@Override
	public boolean login(User user) {
		
		// 1. 创建SqlSessionFactoryUtil对象
		SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
		
		// 2. 创建SqlSession对象，从SqlSessionFactory中获取
		SqlSession openSession = sqlSessionFac.openSession();
		
		// 3. 从Dao接口 生成 userdao对象
		UserDao mapper = openSession.getMapper(UserDao.class);
		
		// 4. dao层调用数据库方法
		User loginUser = mapper.SelectUserByUserName(user);
		if(loginUser != null)
		{
			return true;
		}
		return false;
	}
}
