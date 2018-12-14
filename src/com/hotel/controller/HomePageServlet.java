package com.hotel.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotel.dao.PreplotMapper;
import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.PreplotDaoImpl;
import com.hotel.dao.impl.UserDaoImpl;
import com.hotel.entity.Preplot;
import com.hotel.entity.User;
import com.hotel.service.impl.PreplotServiceImpl;
import com.hotel.service.impl.UserServiceImpl;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/HomePage")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageServlet() {
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
		System.out.println("到此");
		HttpSession session=request.getSession();
        User user = (User)session.getAttribute("user");
        String phonenum = user.getPhonenum();
        
        //查询该用户的订单情况
        PreplotServiceImpl plotsp =  new  PreplotServiceImpl();
        PreplotMapper plotm = new  PreplotDaoImpl();
		plotsp.setPreplotMapper(plotm);
        List<Preplot> userplot = plotsp.selectByUserKey(phonenum) ;
        List<Preplot> completeplot = new ArrayList<Preplot>();     //已完成订单
        List<Preplot> uncompleteplot = new ArrayList<Preplot>();    //未完成订单
        for (Preplot pre:userplot)
        {
        	if (pre.getFinish()==0)   
        		uncompleteplot.add(pre);
        	else
        		completeplot.add(pre);
        }
        
        session.setAttribute("complete", completeplot);
        session.setAttribute("uncomplete", uncompleteplot);
        
		request.getRequestDispatcher("/index.jsp").forward(request, response);  
		System.out.println("结束");
	}

}
