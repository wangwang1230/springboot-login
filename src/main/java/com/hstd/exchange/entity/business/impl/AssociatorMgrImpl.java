//package com.hstd.exchange.entity.business.impl;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.log4j.Logger;
//
//import com.hstd.exchange.entity.model.Associator;
//import com.util.MybatisUtil;
//
//@SuppressWarnings("unchecked")
//public class AssociatorMgrImpl implements IAssociatorMgr {
//	private SqlSession sqlSession;
//	public AssociatorMgrImpl(){
//		this(Logger.getLogger(AssociatorMgrImpl.class));
//		sqlSession=MybatisUtil.getSqlSession();
//	}
//	public AssociatorMgrImpl(Logger logger){
//	}
//	@Override
//	public void associatorRegister(Associator associator) throws Exception {
//		String acctNo = associator.getAcctNo();
//		//注册校验：用户名唯一 /email唯一  /手机号唯一
//		String[] strs = checkAcctNo(acctNo);
//		if(!strs[0].equals("0")){
//			throw new Exception(strs[1]);
//		}
//		if(associator.getPassword().length() > 12 || associator.getPassword().length() <6){
//			throw new Exception("C|密码长度应在6--12位之间！");
//		}
//		sqlSession.selectOne("", associator);
//		AssociatorExample exmp1 = new AssociatorExample();
//		exmp1.setAcctNo(acctNo);
//		exmp1.setAcctNo_Indicator(AssociatorExample.EXAMPLE_EQUALS);
//		List list1 = associatorDao.selectByExample(exmp1);
//		if(list1.size() > 0){
//			throw new Exception("C|该账号已经被注册！");
//		}
//		if(!isMobileNO(associator.getMobilePhone())){
//			throw new Exception("C|请输入正确的手机号！");
//		}
//		AssociatorExample exmp2 = new AssociatorExample();
//		exmp2.setEmail(associator.getEmail());
//		exmp2.setEmail_Indicator(AssociatorExample.EXAMPLE_EQUALS);
//		List list2 = associatorDao.selectByExample(exmp2);
//		if(list2.size() > 0){
//			throw new Exception("C|该邮箱已经被注册！");
//		}
//		String password = Encoder.encrypt_AES_to_HEX(associator.getPassword(),Global.getKey());
//		associator.setPassword(password);
//		associatorDao.insert(associator);
//	}
//	private String[] checkAcctNo(String acctNo){
//		String[] strs = new String[2];
//		strs[0] = "0";
//		strs[1] = "用户名正确！";
//		if(acctNo.equals("")){
//			strs[0] = "1";
//			strs[1] = "C|用户名不能为空";
//			return strs;
//		}
//		if(acctNo.length() > 14 || acctNo.length() < 3){
//			strs[0] = "1";
//			strs[1] = "C|用户名长度应在3 -- 14位之间";
//			return strs;
//		}
//		boolean acctNoConsist = checkAcctNoConsist(acctNo);
//		if(!acctNoConsist){
//			strs[0] = "1";
//			strs[1] = "C|用户名必须由小写字母、数字、下划线组成";
//			return strs;
//		}
//		boolean firstChar = checkAcctNoFirstChar(acctNo);
//		if(!firstChar){
//			strs[0] = "1";
//			strs[1] = "C|用户名首位必须以小写字母开头";
//			return strs;
//		}
//		return strs;
//	}
//	private boolean checkAcctNoConsist(String acctNo){
//		String regex = "([a-z0-9_])*$";
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(acctNo);
//		boolean flag = m.matches();
//		return flag;
//	}
//	private boolean checkAcctNoFirstChar(String acctNo){
//		char[] chars = new char[1];
//		chars[0]= acctNo.charAt(0);
//		String temp = new String(chars);
//		String regex = "^[a-z]";
//		if(temp.matches(regex)){
//			return true;
//		}else{
//			return false;
//		}
//	}
//	private boolean checkAcctNoUpperChar(String acctNo){
//		boolean result = true;
//		char[] chars = new char[1];
//		String regex = "^[A-Z]";
//		for(int i=0; i< acctNo.length(); i++){
//			chars[0]= acctNo.charAt(i);
//			String temp = new String(chars);
//			if(temp.matches(regex)){
//				result = false;
//			}
//		}
//		return result;
//	}
//	private  boolean isMobileNO(String mobiles){  
//		Pattern p = Pattern.compile("^((13[0-9])|(17[0,1,3,6,7,8])|(15[^4,\\D])|(18[0-9]))\\d{8}$");  
//		Matcher m = p.matcher(mobiles);  
//		System.out.println(m.matches()+"---");  
//		return m.matches();  
//		  
//	}
//}
