package com.hotel.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.UserMapper;
import com.hotel.dao.impl.UserDaoImpl;
import com.hotel.entity.User;
import com.hotel.service.impl.UserServiceImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		UserServiceImpl usersp =  new UserServiceImpl();
		UserMapper userm = new UserDaoImpl();
		usersp.setMemberMapper(userm);
		User user = new User();
		
		String  userPhone = request.getParameter("Username");
		String  userPsw = request.getParameter("Password");
		String  eMail = request.getParameter("e_mail");
		
		
		user.setPhonenum(userPhone);
		user.setPsw(userPsw);
		user.setEmail(eMail);
		user.setIdentity("5");
		
		if ( usersp.selectByPrimaryKey(userPhone)==null )
		{
			usersp.insertSelective(user);
			System.out.println("register success");
			request.getRequestDispatcher("/login.jsp").forward(request, response);  
		}
		
		else 
		{
			System.out.println("register fail");
			response.sendRedirect(request.getContextPath()+"/register.jsp");
		}
		
	}

}
