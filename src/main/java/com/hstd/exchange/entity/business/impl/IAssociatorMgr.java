/**
 * 价差组合接口
 */
package com.hstd.exchange.entity.business.impl;

import java.util.List;
import java.util.Map;

import com.hstd.exchange.entity.model.Associator;
/**
 * @author hc
 * 
 */
public interface IAssociatorMgr {
	/**
	 * 会员注册
	 * @param associator
	 * @return 影响的行数
	 * @throws Exception
	 */
	public void associatorRegister(Associator associator) throws Exception;
	
}
