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
	 * ��ҳ
	 * @return ע��ҳ��
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
		//ע��У�飺�û���Ψһ /emailΨһ  /�ֻ���Ψһ
		String[] strs = checkAcctNo(acctNo);
		if(!strs[0].equals("0")){
			throw new Exception(strs[1]);
		}
		if(associator.getPassword().length() > 12 || associator.getPassword().length() <6){
			throw new Exception("C|���볤��Ӧ��6--12λ֮�䣡");
		}
		AssociatorExample exmp1 = new AssociatorExample();
		exmp1.setAcctNo(acctNo);
		exmp1.setAcctNo_Indicator(AssociatorExample.EXAMPLE_EQUALS);
		List list1 = associatorDao.selectByExample(exmp1);
		if(list1.size() > 0){
			throw new Exception("C|���˺��Ѿ���ע�ᣡ");
		}
		if(!isMobileNO(associator.getMobilePhone())){
			throw new Exception("C|��������ȷ���ֻ��ţ�");
		}
//		if(associator.getEmail() == ""){
//			throw new Exception("���������䣡");
//		}
//		if(!validateEmail(associator.getEmail())){
//			throw new Exception("�����ʽ����ȷ��");
//		}
		AssociatorExample exmp2 = new AssociatorExample();
		exmp2.setEmail(associator.getEmail());
		exmp2.setEmail_Indicator(AssociatorExample.EXAMPLE_EQUALS);
		List list2 = associatorDao.selectByExample(exmp2);
		if(list2.size() > 0){
			throw new Exception("C|�������Ѿ���ע�ᣡ");
		}
//		if(associator.getCustType() == ""){
//			throw new Exception("��ָ����Ա���ͣ�");
//		}
		String password = Encoder.encrypt_AES_to_HEX(associator.getPassword(),Global.getKey());
		associator.setPassword(password);
		associatorDao.insert(associator);
	}
	private String[] checkAcctNo(String acctNo){
		String[] strs = new String[2];
		strs[0] = "0";
		strs[1] = "�û�����ȷ��";
		if(acctNo.equals("")){
			strs[0] = "1";
			strs[1] = "C|�û�������Ϊ��";
			return strs;
		}
		if(acctNo.length() > 14 || acctNo.length() < 3){
			strs[0] = "1";
			strs[1] = "C|�û�������Ӧ��3 -- 14λ֮��";
			return strs;
		}
		boolean acctNoConsist = checkAcctNoConsist(acctNo);
		if(!acctNoConsist){
			strs[0] = "1";
			strs[1] = "C|�û���������Сд��ĸ�����֡��»������";
			return strs;
		}
		boolean firstChar = checkAcctNoFirstChar(acctNo);
		if(!firstChar){
			strs[0] = "1";
			strs[1] = "C|�û�����λ������Сд��ĸ��ͷ";
			return strs;
		}
		return strs;
	}
}
