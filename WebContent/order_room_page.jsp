<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订房页面</title>
<link rel="stylesheet" type="text/css" href="css/order_room_page.css"/>
   <script type="text/javascript">
 //检验时间大小
function checkDate(){
	 var obj=document.getElementById('datepicker1').value;
	 var obj_value=obj.replace(/-/g,"/");
	 var obj1=document.getElementById('datepicker2').value;
	 var obj1_value=obj1.replace(/-/g,"/");
	 var date1=new Date(obj_value);//入住时间
	 var date3=new Date(obj1_value);//离店时间
     var date2=new Date();//取今天的日期
	if(date1.getTime()<date2.getTime()){
	alert("入住时间不能小于当前时间！");
	return false;
	}
	if(date3.getTime()<date1.getTime()){
	alert("入住时间不得大于离店时间");
	return false;
	}
		if(date1.getTime()>(date2.getTime()+4* 24 * 3600 * 1000))
			{alert("只能选当前日期五天之内的");
			 return false;}
		if(date3.getTime()>(date2.getTime()+4 * 24 * 3600 * 1000))
		{alert("只能选当前日期五天之内的");
		 return false;}
	} 

 </script>
</head>
<body>
<div id=one >
<div>
<p class="start">酒店页面</p></div>
<div id=two class="first">
<h1>住房日期选择</h1>
</div>
<div id=three class="medir">
  <form name="myform" onsubmit="return checkDate();" action="<%=request.getContextPath()%>/OrderServlet" method="post">
       <div id=four class="form-date-w3-agileits">
		<label><b class="numone">住房开始时间</b></label>
			<input  id="datepicker1" name="startstay" type="date"  required="required">
			</div>
			<div id=six class="form-date-w3-agileits">
			<label><b class="numone">结束住房时间</b></label>
			<input  id="datepicker2" name="endstay" type="date"  required="required">
			</div>
	<div id=eight class="form-date-w3-agileits">
			<label><b class="numone">房间类型</b></label>
				<select name="staytype">
				    <option>房间</option>
					<option>单人间</option>
					<option>双人间/标准间</option>
				    <option>大床间</option>
				    <option>三人间</option>
					<option>套间</option>
					<option>商务间</option>
					</select>
					</div>
	
							<div class="number-right">
							<label><b class="numone">早餐服务个数</b> </label>
							<select name="breakfast">
							   <option value="0">无</option>
				               <option value="1">一个</option>
					           <option value="2">两个</option>
					           <option value="3">三个</option>
				               <option value="4">四个</option>
				               <option value="5">五个</option>
					           <option value="6">六个</option>
					        </select>
					           <label>><b class="numone">停车服务个数</b> </label>
							<select name="park" >
					           <option value="0">无</option>
				               <option value="1">一个</option>
					           <option value="2">两个</option>
					           <option value="3">三个</option>
				               <option value="4">四个</option>
				               <option value="5">五个</option>
					           <option value="6">六个</option>
					        </select>
					       </div>							
							 <div class="tijiao">
					 <input type="submit" value="提交" >
					 </div>
					 </form>
							</div>
							<div id=ten class="final">
	<table>
	<tr>
	<td><center><img class="img1" src="img/book_room_single.jpg" alt="酒店单人间图片"/>
    <p class="text1"><a href="booking.html">酒店单人间</a></p></center></td>   
   <td><center><img class="img1" src="img/book_room_double.jpg" alt="酒店双人间图片"/>
   <p class="text1"><a href="...html">酒店双人间</a></p></center></td>
   </tr>
   <tr>
   <td><center><img class="img1" src="img/book_room_trible.jpg" alt="酒店三人间图片"/>
   <p class="text1"><a href="...html">酒店三人间</a></p></center></td>
   <td><center><img class="img1" src="img/book_room_business.jpg" alt="酒店商务间图片"/>
   <p class="text1"><a href="...html">酒店商务间</a></p></center></td>
   </tr>
   <tr>
   <td><center><img class="img1" src="img/book_room_big.jpg" alt="酒店大床间图片"/>
   <p class="text1"><a href="...html">酒店大床间</a></p></center></td>
   <td><center><img class="img1" src="img/book_room_suite.jpg" alt="酒店套间图片"/>
   <p class="text1"><a href="...html">酒店套间</a></p></center></td>
   </tr>
	 </table>
	 </div>
							<div id=foot1 class="foot2">
							<p>酒店管理系统系统 联系方式  *************</p>
							</div>
   </div>
 
</body>
</html>