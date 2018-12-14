package com.hotel.service;

import com.hotel.entity.User;

public interface UserService {
	 int deleteByPrimaryKey(String phonenum);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(String phonenum);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);

}
