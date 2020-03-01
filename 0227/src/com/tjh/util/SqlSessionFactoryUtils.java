package com.tjh.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	// 获取sqlSessionFactory的公用方法
		public static SqlSessionFactory getSqlSessionFac() {
			// 构建sqlSessionFactoryBuilder
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			InputStream resourceAsStream = null;
			try {
				resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// sqlSessionFactoryBuilder+SqlMapConfig.xml 生成SqlSessionFactory
			SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
			return build;
		}
}
