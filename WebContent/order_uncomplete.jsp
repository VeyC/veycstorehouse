<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.hotel.entity.*"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css"  href="css/order_completed.css"/>
<title>order uncompleted</title>
</head>
<body>
<div class="top">
   <div class="top-hotel-name">
   <img alt=" " src="img/logo 2.png" height="100" width="200">
   </div>
   <div class="date">
   
   </div>
</div>
<%  List<Preplot> uncomplete = (List<Preplot>)request.getSession().getAttribute("uncomplete");%>
<form id="order_information"  class="order_information" action="">
     <table  id="information" class="information">
     <tr>
         <th>订单编号</th>
         <th>预定入住日期-离店日期</th>
         <th>实际入住日期</th>
         <th>实际离店时间</th>
     </tr> 
     <%for (Preplot pre: uncomplete) 
	     {%>
    	 <tr>
	         <td><%=pre.getBooknum() %></td>
	         <td><%=pre.getStartstaytime()%>-<%=pre.getEndstaytime() %></td>
	         <td><%=pre.getAtimearrival() %></td>
	         <td><%=pre.getAtimeleave() %></td>
    	 </tr> 
	 <%}%>   
      
     </table>  
</form>
</body>
</html>