package com.hotel.service.impl;

import com.hotel.dao.UserMapper;
import com.hotel.entity.User;
import com.hotel.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserMapper usermapper;
	
	public UserMapper getMemberMapper() {
		return usermapper;
	}

	public void setMemberMapper(UserMapper usermapper) {
		this.usermapper = usermapper;
	}
	
	@Override
	public int deleteByPrimaryKey(String phonenum) {
		int res = usermapper.deleteByPrimaryKey(phonenum);
		return res;
	}

	@Override
	public int insert(User record) {
		int res = usermapper.insert(record);
		return res;
	}

	@Override
	public int insertSelective(User record) {
		int res = usermapper.insertSelective(record);
		return res;
	}

	@Override
	public User selectByPrimaryKey(String phonenum) 
	{ 
		User user = new User();
		user= usermapper.selectByPrimaryKey(phonenum);
		return user;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		int res = usermapper.updateByPrimaryKeySelective(record);
		return res;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		int res = usermapper.updateByPrimaryKey(record);
		return res;
	}


}
