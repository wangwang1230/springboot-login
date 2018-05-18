package com.hstd.exchange.entity.web;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hstd.exchange.entity.model.Associator;
import com.utils.MybatisUtil;

/**
 * @author wh
 * @return json restful
 * 1.只提供服务
 */
@RestController
public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);
	private SqlSession sqlSession = MybatisUtil.getSqlSession();
	private Model model;
	/**
	 * @return index.html
	 */
	@RequestMapping(value = "/index")
	public String index() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("welcome", "欢迎欢迎！");
		model.addAttribute("index", "票市通");
		model.addAttribute("map", map);
		return "/index";
	}

	/**
	 * @author wh
	 * @return 注册页面
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestBody Associator associator) {
		model.addAttribute("result","success");
		return "/register";
	}

	@RequestMapping()
	public String login(){
		return "/login";
	}
}
