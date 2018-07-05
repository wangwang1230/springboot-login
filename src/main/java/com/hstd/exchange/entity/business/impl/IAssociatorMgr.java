package com.hstd.exchange.entity.business.impl;

import com.hstd.exchange.entity.model.Associator;
import com.response.Response;

/**
 * @author hc
 * 
 */
public interface IAssociatorMgr {
	/**
	 * 会员注册
	 * 
	 * @param associator
	 * @return 影响的行数
	 * @throws Exception
	 */
	public Response associatorRegister(Associator associator) throws Exception;

	public Response associatorLogin(String accNo, String password) throws Exception;

	public Response getAssociator(long id) throws Exception;

	public Response getAssociator(String accNO) throws Exception;
}
