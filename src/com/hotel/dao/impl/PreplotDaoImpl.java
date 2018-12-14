package com.hotel.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hotel.dao.PreplotMapper;
import com.hotel.entity.Preplot;
import com.hotel.util.SessionFactory;

public class PreplotDaoImpl extends SessionFactory implements PreplotMapper {

	@Override
	public int deleteByPrimaryKey(Integer booknum) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			premapper.deleteByPrimaryKey(booknum);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public int insert(Preplot record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			premapper.insert(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public int insertSelective(Preplot record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			premapper.insertSelective(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public Preplot selectByPrimaryKey(Integer booknum) {
		SqlSession session = sqlSessionFactory.openSession();
		Preplot pre = new Preplot();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			pre = premapper.selectByPrimaryKey(booknum);
	        session.commit();
        } finally {
            session.close();
        }
		return pre;
	}

	@Override
	public int updateByPrimaryKeySelective(Preplot record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			premapper.updateByPrimaryKeySelective(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Preplot record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			premapper.updateByPrimaryKey(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
	
	public List<Preplot> selectByUserKey(String phonenum)
	{
		SqlSession session = sqlSessionFactory.openSession();
		List<Preplot> userpre = new ArrayList<Preplot>();
		try {
			PreplotMapper premapper = session.getMapper(PreplotMapper.class);  
			userpre = premapper.selectByUserKey(phonenum);
	        session.commit();
        } finally {
            session.close();
        }
		return userpre;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
