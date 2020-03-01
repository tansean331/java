package com.tjh.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	// ��ȡsqlSessionFactory�Ĺ��÷���
		public static SqlSessionFactory getSqlSessionFac() {
			// ����sqlSessionFactoryBuilder
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			InputStream resourceAsStream = null;
			try {
				resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// sqlSessionFactoryBuilder+SqlMapConfig.xml ����SqlSessionFactory
			SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
			return build;
		}
}
