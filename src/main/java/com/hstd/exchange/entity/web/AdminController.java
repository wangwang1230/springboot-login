package com.hstd.exchange.entity.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hstd.exchange.entity.business.impl.AssociatorMgrImpl;
import com.hstd.exchange.entity.model.Associator;
import com.response.Response;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author wh
 * @return json 只提restful供服务
 */
@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class AdminController {
	private Logger logger = Logger.getLogger(AdminController.class);
	private AssociatorMgrImpl associatorMgrImpl = new AssociatorMgrImpl();

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Response getUser() {
		return new Response().success();
	}

	@ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "long", paramType = "path")
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public Response getUserById(@PathVariable long id) throws Exception {
		return associatorMgrImpl.getAssociator(id);
	}

	/**
	 * @param accNo
	 * @return
	 * @throws Exception
	 *             根据账号获取用户
	 */
	@ApiOperation(value = "获取用户详细信息", notes = "根据url账号获取用户详细信息")
	@ApiImplicitParam(name = "accNo", value = "用户账号", required = true, dataType = "String", paramType = "path")
	@RequestMapping(value = "/accNo/{accNo}", method = RequestMethod.POST)
	public Response getUserByAccNo(@PathVariable String accNo) throws Exception {
		return associatorMgrImpl.getAssociator(accNo);
	}

	/**
	 * @param associator
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "创建用户", notes = "根据Associator对象创建用户")
	@ApiImplicitParam(name = "associator", value = "用户详细实体Associator", required = true, dataType = "Associator")
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Response register(@RequestBody Associator associator) throws Exception {
		// 调用注册接口
		return associatorMgrImpl.associatorRegister(associator);
	}

	@ApiOperation(value = "用户登录", notes = "根据账号密码登录系统")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "accNo", value = "账号", required = true, dataType = "String", paramType = "path"),
			@ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "path") })
	@RequestMapping(value = "/login/{accNo}/{password}", method = RequestMethod.GET)
	public Response login(@PathVariable("accNo") String accNo, @PathVariable("password") String password)
			throws Exception {
		// 调用登录业务接口
		return associatorMgrImpl.associatorLogin(accNo, password);
	}
}
