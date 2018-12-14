package com.hotel.test;

import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.UserDaoImpl;
import com.hotel.entity.User;
import com.hotel.service.impl.UserServiceImpl;

//测试按主键查询
public class test1 {

	public static void main(String[] args) {
		UserServiceImpl usersp =  new UserServiceImpl();
		UserMapper userm = new UserDaoImpl();
		usersp.setMemberMapper(userm);
		
		User user = new User();
		user = usersp.selectByPrimaryKey("111");
		System.out.println(user);
	}

}
