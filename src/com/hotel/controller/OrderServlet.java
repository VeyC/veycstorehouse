package com.hotel.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.PreplotMapper;
import com.hotel.dao.RoomMapper;
import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.PreplotDaoImpl;
import com.hotel.dao.impl.RoomDaoImpl;
import com.hotel.dao.impl.UserDaoImpl;
import com.hotel.entity.Preplot;
import com.hotel.entity.Room;
import com.hotel.entity.User;
import com.hotel.service.impl.PreplotServiceImpl;
import com.hotel.service.impl.RoomServiceImpl;
import com.hotel.service.impl.UserServiceImpl;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PreplotServiceImpl presp =  new PreplotServiceImpl();
		PreplotMapper prem = new PreplotDaoImpl();
		presp.setPreplotMapper(prem);;
		Preplot preplot = new Preplot();
		
		RoomServiceImpl roomsp =  new RoomServiceImpl();
		RoomMapper roomm = new RoomDaoImpl();
		roomsp.setRoommapper(roomm);
		
		//这里还要局部刷新，在选完日期后，提供房型。先在Room中查找房型，
		
		
		//在选完房型后，在Room中查找房间号(hashMAp)
		
		//确认用户已经登录
		User user = (User)request.getSession().getAttribute("user");
		String userphone = user.getPhonenum();
		if (userphone!= null)
		{		
			String startstay = request.getParameter("startstay");
			String endstay = request.getParameter("endstay");
			
			String breakfast = request.getParameter("breakfast");
			String park = request.getParameter("park");
			
			Date today = new Date();    //今天
			
			//将字符串类型化成date类型
			//创建字符串
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			//2. 调用parse方法，将字符串转成Date对象
			 Date startstaydate = null;
			 Date endstaydate = null;
			try {
				startstaydate = sdf.parse(startstay);
				endstaydate = sdf.parse(endstay);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			int startday = startstaydate.getDate()-today.getDate();     //开始预订的时间距离当前时间
			int endday = endstaydate.getDate()-today.getDate()-1;         //结束预订的时间距离当前时间
			Map<String,Integer> requiremap = new HashMap<String,Integer>();
			for (int i=startday;i<=endday;i++)
			{
				switch(i)
				{
				case 0:
					requiremap.put("day0", 1);
					break;
				case 1:
					requiremap.put("day1", 1);
					break;
				case 2:
					requiremap.put("day2", 1);
					break;
				case 3:
					requiremap.put("day3", 1);
					break;
				case 4:
					requiremap.put("day4", 1);
					break;
				}
			}
			
			List<Room> needroom = roomsp.selectRoomsByNeedDate(requiremap);
			
			
		}//endif(user)
	}

}
