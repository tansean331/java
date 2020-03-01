package com.tjh.mybaits;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybaits {
	public static void main(String[] args) {
		// 1. 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

			// 2. 加载SqlMapConfig.xml配置文件
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 3. 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
				
			// 4. 创建SqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			// 5. 执行SqlSession对象执行查询，获取结果User
			// 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
			Object user = sqlSession.selectOne("queryUserById", 5);
			
			Object users = sqlSession.selectList("queryUserByUsername", "a12");
			// 6. 打印结果
			System.out.println(users);
			
			// 7. 释放资源
			sqlSession.close();
	}
}
