<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.hotel.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css"  href="css/index.css"/>
<title>酒店主页</title>
</head>
<body>
<div class="top">
   <div class="top-hotel-name">
   <img alt=" " src="img/logo 2.png" height="100" width="200">
   </div>
 <!-- <div class="login">
     <a href="login.jsp" >
         <pre>登  录</pre>
     </a>
   </div>      -->
   <% User user = new User();
     user = (User)request.getSession().getAttribute("user");
     if(user == null) {%>
     <div class="login">
     <a href="login.jsp" >
         <pre>登  录</pre>
     </a>
   </div> 
   <%}else {%>
   <div class="login">
     <a href="user_profile.jsp" >
         <pre><%=user.getPhonenum() %></pre>
     </a>
   </div>  <%} %>
   <div class="refresh"></div>
</div>
<!--
	
<div class="middle">
   <div class="booking">
      <a href="booking.html" >
      <img alt=" " src="img\1.jpg " height="600" width="950">
      </a>
   </div>
   <div class="environment">
      <a href="environment.html">
      <img alt=""  src="img\2.jpg"  height="600" width="950">
      </a> 
   </div>
</div>

-->
<div class="middle">
   <div class="booking">
      <a href="order_room_page.jsp" >
      <img alt=" " src="img\1.jpg " height="600px" width="100%">
      </a>
   </div>
   <div class="environment">
      <a href="environment.html">
      <img alt=""  src="img\2.jpg"  height="600px" width="100%">
      </a> 
   </div>
</div>


<table>
<tr>
  <td>咨询电话：888888</td>
  <td>酒店地址：山的那边海的那边</td>
</tr>
<tr>
  <td>投诉电话：666666</td>
  <td>酒店提供免费wifi</td>
</tr>



</table>
</body>
</html>