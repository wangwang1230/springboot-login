package com.forlink.exchange.pub.db;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author wh 适配器类SqlMapClient的工具类
 */
public class DBUtil {
	private static SqlMapClient client = null;
	static {
		try {
			client = new SqlMapClient();
			if (client == null) {
				throw new Exception("获取SqlMapClient失败！");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @author wh
	 * @return SqlMapClient 获取适配器SqlMapClient
	 */
	public static SqlMapClient getSqlMap() {
		return client;
	}
}
