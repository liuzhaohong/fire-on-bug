package com.zhlh.zeus.dao.mapper;

import com.zhlh.zeus.dao.model.City;

public interface CityMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}