package com.tjh.mybaits;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybaits {
	public static void main(String[] args) {
		// 1. ����SqlSessionFactoryBuilder����
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

			// 2. ����SqlMapConfig.xml�����ļ�
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 3. ����SqlSessionFactory����
			SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
				
			// 4. ����SqlSession����
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			// 5. ִ��SqlSession����ִ�в�ѯ����ȡ���User
			// ��һ��������User.xml��statement��id���ڶ���������ִ��sql��Ҫ�Ĳ�����
			Object user = sqlSession.selectOne("queryUserById", 5);
			
			Object users = sqlSession.selectList("queryUserByUsername", "a12");
			// 6. ��ӡ���
			System.out.println(users);
			
			// 7. �ͷ���Դ
			sqlSession.close();
	}
}
