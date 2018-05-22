package com.hstd.exchange.entity.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hstd.exchange.entity.business.impl.AssociatorMgrImpl;
import com.hstd.exchange.entity.model.Associator;
import com.response.Response;

/**
 * @author wh
 * @return json 
 * 只提restful供服务
 */
@RestController
@RequestMapping(value="/user")
@CrossOrigin
public class AdminController {
	private Logger logger = Logger.getLogger(AdminController.class);
	private AssociatorMgrImpl associatorMgrImpl = new AssociatorMgrImpl();
	@RequestMapping(value = "/all", method=RequestMethod.GET)
	public Response getUser() {
		return new Response().success();
	}
	
	@RequestMapping(value="/{id}" , method=RequestMethod.GET)
	public Response getUserById(@PathVariable long id) throws Exception {
		Associator associator =associatorMgrImpl.getAssociator(id);
		return new Response().success(associator);
	}
	
	
	/**
	 * @param accNo
	 * @return 
	 * @throws Exception
	 * 根据账号获取用户
	 */
	@RequestMapping(value="/accNo/{accNo}", method=RequestMethod.GET)
	public Response getUserByAccNo(@PathVariable String accNo) throws Exception{
		return associatorMgrImpl.getAssociator(accNo);
	}
	
	/**
	 * @param associator
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public Response register(@RequestBody Associator associator) throws Exception{
		//调用注册接口
		return associatorMgrImpl.associatorRegister(associator);
	}
	
	@RequestMapping(value="/login/{accNo}/{password}",method=RequestMethod.GET)
	public Response login(@PathVariable("accNo") String accNo , @PathVariable("password") String password) throws Exception{
		//调用登录业务接口
		return associatorMgrImpl.associatorLogin(accNo,password);
	}
}
