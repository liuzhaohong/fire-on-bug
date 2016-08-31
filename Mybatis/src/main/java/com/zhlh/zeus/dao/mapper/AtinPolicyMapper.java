package com.zhlh.zeus.dao.mapper;

import com.zhlh.zeus.dao.model.AtinPolicy;

public interface AtinPolicyMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AtinPolicy record);

    int insertSelective(AtinPolicy record);

    AtinPolicy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AtinPolicy record);

    int updateByPrimaryKey(AtinPolicy record);
}