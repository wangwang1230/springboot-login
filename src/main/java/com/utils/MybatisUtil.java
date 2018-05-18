package com.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author wh 创建SqlSession工具类
 * 
 */
public class MybatisUtil {

	// private static SqlSessionFactory sqlSessionFactory = null;
	private static SqlSession sqlSession = null;
	static {
		try {
			Reader resourceAsReader = Resources.getResourceAsReader("Mybatis-Config.xml");
			if (resourceAsReader == null) {
				throw new Exception("读取数据库资源resourceAsReader失败");
			}
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
			if (sqlSessionFactory == null) {
				throw new Exception("获取sqlSessionFactory失败");
			}
			sqlSession = sqlSessionFactory.openSession();
			if (sqlSession == null) {
				throw new Exception("打开sqlsession失败");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @author wh
	 * @return SqlSessionFactory 提供公共的获取SqlSessionFactory方法
	 */
	// public static SqlSessionFactory getSqlSessionFactory() {
	// return sqlSessionFactory;
	// }

	/**
	 * @author wh
	 * @return SqlSession 公共的SqlSession获取方法
	 */
	public static SqlSession getSqlSession() {
		return sqlSession;
	}
}
