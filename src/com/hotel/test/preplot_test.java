package com.hotel.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.hotel.dao.PreplotMapper;
import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.PreplotDaoImpl;
import com.hotel.entity.Preplot;
import com.hotel.service.impl.PreplotServiceImpl;

public class preplot_test {

	public static void main(String[] args) {
		PreplotServiceImpl presp =  new PreplotServiceImpl();
		PreplotMapper premapper = new PreplotDaoImpl();
		presp.setPreplotMapper(premapper);
		
		//插入测试
		Preplot pre = new Preplot();
		pre.setBooknum(11);
		pre.setPhonenum("123");
		pre.setRoomnum("r5");
		Date date = new Date();
		DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String punchTime = simpleDateFormat.format(date);//格式化后的时间
//		System.out.println(date);
//		System.out.println(punchTime);
		//Wed Dec 05 10:20:02 CST 2018
		//2018-12-05 10:20:02
		pre.setBooktime(punchTime);
		pre.setStartstaytime(punchTime);
		pre.setEndstaytime(punchTime);
		pre.setFinish(0);       //未完成		
		if (presp.insertSelective(pre)==0)
			System.out.println("插入完成！");
	
		//选择测试
		Preplot selectpre = presp.selectByPrimaryKey(8);
		System.out.println(selectpre);		
		
		List<Preplot> userpre = presp.selectByUserKey("888");
		for (Preplot upre:userpre)
			System.out.println(upre);

	}

}
