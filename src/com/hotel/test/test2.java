package com.hotel.test;

import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.UserDaoImpl;
import com.hotel.entity.User;
import com.hotel.service.impl.UserServiceImpl;

//用户插入测试
public abstract class test2 {

	public static void main(String[] args) {
		UserServiceImpl usersp =  new UserServiceImpl();
		UserMapper userm = new UserDaoImpl();
		usersp.setMemberMapper(userm);
		
		User user = new User();
		user.setPhonenum("555");
		user.setPsw("555");
		user.setEmail("em5");
		user.setIdentity("5");
		
		if (usersp.insertSelective(user)==0)
			System.out.println("insert success");
		else
			System.out.println("insert fail");
	}
	

}
