package com.ibatis.sqlmap.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.ibatis2mybaits.adpter.SqlMapClientAdapter;
import com.utils.MybatisUtil;

/**
 * @author wh 自定义SqlMapClient类，适配mybatis的sqlSession及对应方法，以适应项目中原有dao方法的使用
 */
public class SqlMapClient implements SqlMapClientAdapter {

	private SqlSession sqlSession;

	public SqlMapClient() {
		this.sqlSession = MybatisUtil.getSqlSession();
	}

	@Override
	public int insert(String statement, Object params) {
		return sqlSession.insert(statement, params);
	}

	@Override
	public <T> T queryForObject(String statement, Object params) {
		return sqlSession.selectOne(statement, params);
	}

	@Override
	public int update(String statement, Object params) {
		return sqlSession.update(statement, params);
	}

	@Override
	public <T> List<T> queryForList(String statement, Object params) {
		return sqlSession.selectList(statement, params);
	}

	@Override
	public <T> List<T> queryForList(String statement) {
		return sqlSession.selectList(statement);
	}

	@Override
	public int delete(String statement, Object params) {
		return sqlSession.delete(statement, params);
	}

	@Override
	public <T> T queryForObject(String statement) {
		return sqlSession.selectOne(statement);
	}

}
