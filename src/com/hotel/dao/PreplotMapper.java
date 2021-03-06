package com.hotel.dao;

import java.util.List;

import com.hotel.entity.Preplot;

public interface PreplotMapper {
    int deleteByPrimaryKey(Integer booknum);

    int insert(Preplot record);

    int insertSelective(Preplot record);

    Preplot selectByPrimaryKey(Integer booknum);

    int updateByPrimaryKeySelective(Preplot record);

    int updateByPrimaryKey(Preplot record);
    
    List<Preplot> selectByUserKey(String phonenum);
}