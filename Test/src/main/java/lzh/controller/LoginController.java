package lzh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lzh.model.User;
import lzh.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class LoginController {

	// @RequestMapping(value="/loginController.do",method = RequestMethod.POST)
	// public String login(@ModelAttribute("user") User user){
	// user.getUsername();
	// return "jsp/ok";
	// }
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@ResponseBody
	@RequestMapping("/loginController.do")
	public String login(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(userName);
		user.setPassword(password);
		Map map = new HashMap();
		map.put("username", userName);
		map.put("password", password);
		user = userService.userLoginByMap(map);
		request.setAttribute("user", user);
		if (user != null) {
			return JSON.toJSONString(user);
		}
		return "jsp/ban";
	}
}
