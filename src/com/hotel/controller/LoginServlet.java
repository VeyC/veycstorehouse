package com.hotel.controller;

import java.io.IOException;



import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

import org.apache.tools.ant.taskdefs.SendEmail;

import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.UserDaoImpl;
import com.hotel.entity.User;
import com.hotel.service.impl.UserServiceImpl;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//	response.setContentType("text/html;charset=utf-8");
	//	PrintWriter out=response.getWriter();
		UserServiceImpl usersp =  new UserServiceImpl();
		UserMapper userm = new UserDaoImpl();
		usersp.setMemberMapper(userm);
		User user = new User();
		
		String  userPhone = request.getParameter("Username");
		String userPsw = request.getParameter("Password");
		
		user.setPhonenum(userPhone);
		user.setPsw(userPsw);
		
		//用户名不存在
		if(usersp.selectByPrimaryKey(userPhone)==null)
		{			
			System.out.println("useraccount dose not exist");
		//	request.setAttribute("error","username dose not exist"); 
			request.getRequestDispatcher("/login.jsp").forward(request, response);  
		}
		else 
		{   
			user = usersp.selectByPrimaryKey(userPhone);
			if (user.getPsw().equals(userPsw)==false) //用户名存在，但密码输入错误
			{
				System.out.println("password error");
				response.getWriter().print("password error");
				
	//			request.setAttribute("error","password error");
	//			request.getRequestDispatcher("/login.jsp").forward(request, response);
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
			else  //登录成功
			{
				System.out.println("login success");
				HttpSession session = request.getSession();
				session.setAttribute("user",user);  //向前台返回user信息
				response.sendRedirect(request.getContextPath()+"/HomePage");
								
			}
		}		
	}
}
