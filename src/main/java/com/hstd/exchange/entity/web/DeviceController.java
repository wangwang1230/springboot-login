package com.hstd.exchange.entity.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping(value = "/api")
@CrossOrigin
public class DeviceController {
	private Logger logger = Logger.getLogger(DeviceController.class);
	private AssociatorMgrImpl associatorMgrImpl = new AssociatorMgrImpl();

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Response getUser() {
		return new Response().success();
	}

	/**
	 * 请求url
	 * “/api/data/${params.pageSize}/${params.equipmentState}/${params.equipmentModel}/${params.id}/${params.userId}”
	 * 此种方式不允许参数为空访问，参数为空访问时会报错，如 “/api/data/6////”
	 * 
	 * @param pageSize
	 * @param equipmentState
	 * @param equipmentModel
	 * @param id
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "long", paramType = "path")
	@RequestMapping(value = "/data/{pageSize}/{equipmentState}/{equipmentModel}/{id}/{userId}", method = RequestMethod.GET)
	public Response getDataforRestful(@PathVariable int pageSize, @PathVariable String equipmentState,
			@PathVariable String equipmentModel, @PathVariable String id, @PathVariable String userId)
			throws Exception {
		System.out.println(equipmentState);
		return associatorMgrImpl.getAssociator(id);
	}

	/**
	 * 请求url
	 * “/api/data?pageSize=${params.pageSize}&equipmentState=${params.equipmentState}&equipmentModel=${params.equipmentModel}&id=${params.id}&userId=${params.userId}”
	 * 当参数为空时不影响访问，允许参数为空值
	 * 
	 * @param pageSize
	 * @param equipmentState
	 * @param equipmentModel
	 * @param id
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "long", paramType = "path")
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public Response getData(@RequestParam("pageSize") int pageSize,
			@RequestParam("equipmentState") String equipmentState,
			@RequestParam("equipmentModel") String equipmentModel, @RequestParam("id") String id,
			@RequestParam("userId") String userId) throws Exception {
		System.out.println(equipmentState);
		return associatorMgrImpl.getAssociator(id);
	}

}
