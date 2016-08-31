package lzh.dao;

import java.util.List;
import java.util.Map;

import lzh.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getAll();
    
    List<User> getAll2();
    
    List<User> getAll3();
    
    User selectUser(User user);
    
    User userLoginByMap(Map map);
    
}