package com.hstd.exchange.entity.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="accNo/{accNo}", method=RequestMethod.GET)
	public Response getUserByAccNo(@PathVariable String accNo) throws Exception{
		Associator associator =associatorMgrImpl.getAssociator(accNo);
		return new Response().success(associator);
	}
	
}
