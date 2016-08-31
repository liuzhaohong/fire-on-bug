package lzh.service;

import java.util.List;
import java.util.Map;

import lzh.model.User;

public interface UserService {

	 User getUserById(int userId);
	
	 List<User> getAll();
	 
	 List<User> getAll2();
	 
	 List<User> getAll3();
	 
	 int insert(User record);
	 
	 User userLogin(User user);
	 
	 User userLoginByMap(Map map);

}
