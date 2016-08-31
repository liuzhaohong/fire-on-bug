package lzh.controller;

import javax.servlet.http.HttpServletRequest;

import lzh.model.User;
import lzh.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userController")
public class UserController {

	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable int id, HttpServletRequest request){
		User user = userService.getUserById(id);
		request.setAttribute("user", user);
		return "/jsp/showUser";
	}
}
