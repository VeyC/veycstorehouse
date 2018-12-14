package com.hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.hotel.dao.PreplotMapper;

import com.hotel.dao.UserMapper;
import com.hotel.entity.Preplot;
import com.hotel.service.PreplotService;

public class PreplotServiceImpl implements PreplotService {

	private PreplotMapper premapper;
	
	public PreplotMapper getPreplotMapper() {
		return premapper;
	}
	
	public void setPreplotMapper(PreplotMapper premapper) {
		this.premapper = premapper;
	}
	
	@Override
	public int deleteByPrimaryKey(Integer booknum) {
		int res = premapper.deleteByPrimaryKey(booknum);
		return res;
	}

	@Override
	public int insert(Preplot record) {
		int res = premapper.insert(record);
		return res;
	}

	@Override
	public int insertSelective(Preplot record) {
		int res = premapper.insertSelective(record);
		return res;
	}

	@Override
	public Preplot selectByPrimaryKey(Integer booknum) {
		Preplot pre = premapper.selectByPrimaryKey(booknum);
		return pre;
	}

	@Override
	public int updateByPrimaryKeySelective(Preplot record) {
		int res = premapper.updateByPrimaryKeySelective(record);
		return res;
	}

	@Override
	public int updateByPrimaryKey(Preplot record) {
		int res = premapper.updateByPrimaryKey(record);
		return res;
	}
	
	public List<Preplot> selectByUserKey(String phonenum)
	{
		List<Preplot> userpre = new ArrayList<Preplot>();
		userpre = premapper.selectByUserKey(phonenum);
		return userpre;
	}

}
