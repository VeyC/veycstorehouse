<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.hotel.entity.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css"  href="css/user_profile.css"/>
<title>Personal Homepage</title>

</head>
<body>
<div class="top">
   <div class="top-hotel-name">
   <img alt=" " src="img/logo 2.png" height="100" width="200">
   </div>
   <div class="date">
   
   </div>
</div>
	<% User user = new User();
	   user = (User)request.getSession().getAttribute("user");%>
   <table id="table_information" class="table_information">
          <tr><th>用户名</th>
              <td><%=user.getPhonenum() %></td>
          </tr>
          <tr><th>邮箱</th>
              <td><%=user.getEmail() %></td>
          </tr>
          <tr><th>已完成订单</th>
              <td><a href="order_completed.jsp">点击查看</a></td>
          </tr>
          <tr><th>未完成订单</th>
              <td><a href="order_uncomplete.jsp">点击查看</a></td>
          </tr>         
   </table>



</body>
</html>