package lzh.service.impl;

import java.util.List;
import java.util.Map;

import lzh.dao.UserMapper;
import lzh.model.User;
import lzh.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	public UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	@Override
	public List<User> getAll() {
		return userMapper.getAll();
	}
	@Override
	public List<User> getAll2() {
		return userMapper.getAll2();
	}
	@Override
	public List<User> getAll3() {
		return userMapper.getAll3();
	}
	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}
	@Override
	public User userLogin(User user) {
		System.out.println(userMapper.selectUser(user));
		return userMapper.selectUser(user);
	}
	@Override
	public User userLoginByMap(Map map) {
		return userMapper.userLoginByMap(map);
	}


}
