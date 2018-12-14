package com.hotel.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.hotel.dao.UserMapper;
import com.hotel.entity.User;
import com.hotel.util.SessionFactory;


public class UserDaoImpl extends SessionFactory implements UserMapper {

	@Override
	public int deleteByPrimaryKey(String phonenum) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);  
			usermapper.deleteByPrimaryKey(phonenum);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
	
	@Override
	public int insert(User record)
	{
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);  
			usermapper.insert(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
	@Override
	public int insertSelective(User record)
	{
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);  
			usermapper.insertSelective(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
	
	@Override
	public User selectByPrimaryKey(String phonenum)
	{
		SqlSession session = sqlSessionFactory.openSession();
		User user = new User();
		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);  
		    user = usermapper.selectByPrimaryKey(phonenum);
	        session.commit();
        } finally {
            session.close();
        }
		return user;
	}
	
	@Override
	public int updateByPrimaryKey(User record)
	{
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);  
			usermapper.updateByPrimaryKey(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
	
	@Override
	public int updateByPrimaryKeySelective(User record)
	{
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);  
			usermapper.updateByPrimaryKeySelective(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
}
