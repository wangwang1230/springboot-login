package com.hstd.exchange.entity.business.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.forlink.fkcore.Global;
import com.forlink.fkcore.security.Encoder;
import com.hstd.exchange.entity.dao.AssociatorMapper;
import com.hstd.exchange.entity.model.Associator;
import com.hstd.exchange.entity.model.AssociatorExample;
import com.hstd.exchange.entity.model.AssociatorExample.Criteria;
import com.hstd.exchange.entity.model.AssociatorKey;
import com.response.Response;
import com.utils.MybatisUtil;

@SuppressWarnings("unchecked")
public class AssociatorMgrImpl implements IAssociatorMgr {
	private SqlSession sqlSession;
	private AssociatorMapper associatorMapper;
	private Logger logger;
	private Response response;

	public AssociatorMgrImpl() {
		logger = Logger.getLogger(AssociatorMgrImpl.class);
		sqlSession = MybatisUtil.getSqlSession();
		associatorMapper = sqlSession.getMapper(AssociatorMapper.class);
		response = new Response();
	}

	@Override
	public Response associatorRegister(Associator associator) throws Exception {
		String acctNo = associator.getAcctNo();
		// 注册校验：用户名唯一 /手机号唯一
		String[] strs = checkAcctNo(acctNo);
		if (!strs[0].equals("0")) {
			return response.failure(strs[1]);
		}
		if (associator.getPassword().length() > 12 || associator.getPassword().length() < 6) {
			return response.failure("C|密码长度应在6--12位之间！");
		}
		AssociatorExample exmp1 = new AssociatorExample();
		Criteria criteria = exmp1.createCriteria();
		criteria.andAcctNoEqualTo(acctNo);
		List list1 = associatorMapper.selectByExample(exmp1);
		if (list1.size() > 0) {
//			logger.info("C|该账号已经被注册！");
			return response.failure("C|该账号已经被注册！");
		}
		if (!isMobileNO(associator.getMobilePhone())) {
//			logger.info("C|请输入正确的手机号！");
			return response.failure("C|请输入正确的手机号！");
		}

		String password = Encoder.encrypt_AES_to_HEX(associator.getPassword(), Global.getKey());
		associator.setPassword(password);
		associatorMapper.insert(associator);
		sqlSession.commit();
//		logger.info(response.success());
		return response.success();
	}

	private String[] checkAcctNo(String acctNo) {
		String[] strs = new String[2];
		strs[0] = "0";
		strs[1] = "用户名正确！";
		if (acctNo.equals("")) {
			strs[0] = "1";
			strs[1] = "C|用户名不能为空";
			return strs;
		}
		if (acctNo.length() > 14 || acctNo.length() < 3) {
			strs[0] = "1";
			strs[1] = "C|用户名长度应在3 -- 14位之间";
			return strs;
		}
		boolean acctNoConsist = checkAcctNoConsist(acctNo);
		if (!acctNoConsist) {
			strs[0] = "1";
			strs[1] = "C|用户名必须由小写字母、数字、下划线组成";
			return strs;
		}
		boolean firstChar = checkAcctNoFirstChar(acctNo);
		if (!firstChar) {
			strs[0] = "1";
			strs[1] = "C|用户名首位必须以小写字母开头";
			return strs;
		}
		return strs;
	}

	private boolean checkAcctNoConsist(String acctNo) {
		String regex = "([a-z0-9_])*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(acctNo);
		boolean flag = m.matches();
		return flag;
	}

	private boolean checkAcctNoFirstChar(String acctNo) {
		char[] chars = new char[1];
		chars[0] = acctNo.charAt(0);
		String temp = new String(chars);
		String regex = "^[a-z]";
		if (temp.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isMobileNO(String mobiles) {
		Pattern p = Pattern.compile("^((13[0-9])|(17[0,1,3,6,7,8])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		System.out.println(m.matches() + "---");
		return m.matches();

	}

	@Override
	public Response getAssociator(long id) throws Exception {
		AssociatorKey key = new AssociatorKey();
		key.setId(id);
		Associator associator = associatorMapper.selectByPrimaryKey(key);
		if (associator==null) {
			return response.failure("你要查询的用户不存在，请检查id是否正确");
		}
		return response.success(associator);
	}

	@Override
	public Response getAssociator(String accNo) throws Exception {
		AssociatorExample example = new AssociatorExample();
		Criteria criteria = example.createCriteria();
		criteria.andAcctNoEqualTo(accNo);
		List<Associator> list = associatorMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			Associator associator = list.get(0);
			return response.success(associator);
		}
		return response.failure("不存在该账号，请检查");
	}

	@Override
	public Response associatorLogin(String accNo, String password) throws Exception {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
		System.out.println(dateFormat.format(date));
		logger.info(accNo + "-登录-时间-" + dateFormat.format(date));
		AssociatorExample example=new AssociatorExample();
		Criteria criteria=example.createCriteria();
		criteria.andAcctNoEqualTo(accNo);
		List<Associator> list = associatorMapper.selectByExample(example);
		if (list !=null &&list.size()>0) {
			Associator associator = list.get(0);
			if (associator.getPassword().equals(Encoder.encrypt_AES_to_HEX(password, Global.getKey()))) {
				return response.success("登录成功");
			}else {
				return response.failure("账号或密码错误!");
			}
		}
		return response.failure("该用户不存在，请先注册！");
	}
}
