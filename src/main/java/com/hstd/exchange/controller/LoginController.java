package com.hstd.exchange.controller;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forlink.fkcore.Global;
import com.forlink.fkcore.security.Encoder;
import com.hstd.exchange.entity.model.Associator;
import com.hstd.exchange.entity.model.AssociatorExample;

@RestController
@RequestMapping(value="/main")
public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);
	/**
	 * 主页
	 * @return 注册页面
	 */
	@RequestMapping(value="/" , method=RequestMethod.GET)
	
	public String index(){
		return "register";
	}
	/**
	 * @param associator
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping()
	public String associatorRegister(Associator associator) throws Exception{
		String acctNo = associator.getAcctNo();
		//注册校验：用户名唯一 /email唯一  /手机号唯一
		String[] strs = checkAcctNo(acctNo);
		if(!strs[0].equals("0")){
			throw new Exception(strs[1]);
		}
		if(associator.getPassword().length() > 12 || associator.getPassword().length() <6){
			throw new Exception("C|密码长度应在6--12位之间！");
		}
		AssociatorExample exmp1 = new AssociatorExample();
		exmp1.setAcctNo(acctNo);
		exmp1.setAcctNo_Indicator(AssociatorExample.EXAMPLE_EQUALS);
		List list1 = associatorDao.selectByExample(exmp1);
		if(list1.size() > 0){
			throw new Exception("C|该账号已经被注册！");
		}
		if(!isMobileNO(associator.getMobilePhone())){
			throw new Exception("C|请输入正确的手机号！");
		}
//		if(associator.getEmail() == ""){
//			throw new Exception("请输入邮箱！");
//		}
//		if(!validateEmail(associator.getEmail())){
//			throw new Exception("邮箱格式不正确！");
//		}
		AssociatorExample exmp2 = new AssociatorExample();
		exmp2.setEmail(associator.getEmail());
		exmp2.setEmail_Indicator(AssociatorExample.EXAMPLE_EQUALS);
		List list2 = associatorDao.selectByExample(exmp2);
		if(list2.size() > 0){
			throw new Exception("C|该邮箱已经被注册！");
		}
//		if(associator.getCustType() == ""){
//			throw new Exception("请指定会员类型！");
//		}
		String password = Encoder.encrypt_AES_to_HEX(associator.getPassword(),Global.getKey());
		associator.setPassword(password);
		associatorDao.insert(associator);
	}
	private String[] checkAcctNo(String acctNo){
		String[] strs = new String[2];
		strs[0] = "0";
		strs[1] = "用户名正确！";
		if(acctNo.equals("")){
			strs[0] = "1";
			strs[1] = "C|用户名不能为空";
			return strs;
		}
		if(acctNo.length() > 14 || acctNo.length() < 3){
			strs[0] = "1";
			strs[1] = "C|用户名长度应在3 -- 14位之间";
			return strs;
		}
		boolean acctNoConsist = checkAcctNoConsist(acctNo);
		if(!acctNoConsist){
			strs[0] = "1";
			strs[1] = "C|用户名必须由小写字母、数字、下划线组成";
			return strs;
		}
		boolean firstChar = checkAcctNoFirstChar(acctNo);
		if(!firstChar){
			strs[0] = "1";
			strs[1] = "C|用户名首位必须以小写字母开头";
			return strs;
		}
		return strs;
	}
}
