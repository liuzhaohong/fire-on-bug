package lzh.dao;

import lzh.model.RoleModule;

public interface RoleModuleMapper {
    int deleteByPrimaryKey(Integer rmid);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    RoleModule selectByPrimaryKey(Integer rmid);

    int updateByPrimaryKeySelective(RoleModule record);

    int updateByPrimaryKey(RoleModule record);
}