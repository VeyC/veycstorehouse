<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"  type="text/css"  href="css/register.css"/>
<script type="text/javascript">
function check(){
	var name=document.getElementById("Username").value;
	var pwd=document.getElementById("Password").value;
	var mail=document.getElementById("e_mail").value;
	var _pwd=document.getElementById("_Password").value;
	if((name=="")||(name==null)){
		alert("请输入用户名");
		
		return;
	}else if((pwd=="")||(pwd==null)){
		alert("请输入密码！");
		
		return;
	}else if((mail=="")||(mail==null)){
		alert("请输入邮箱！");
		
		return;
	}else if((_pwd=="")||(_pwd==null)){
		alert("请确认密码！");
		
		return;
	}
//	else{
//		form.submit();
//	}
	 	
}
</script>
<title>注册页面</title>
</head>
<body>
<div class="top">
   <div class="top-hotel-name">
   <img alt=" " src="img/logo 2.png" height="100" width="200">
   </div>
   <div class="login"></div>
   <div class="refresh"></div>
</div>
<div class="form">
     <form action="<%=request.getContextPath()%>/RegisterServlet" method="post">
           <pre>用户名</pre><input type="text" name="Username" id="Username"/><br>
           <pre>密  码  </pre><input type="password" name="Password" id="Password"/><br>
           <pre>邮  箱 </pre><input type="text" name="e_mail" id="e_mail"/><br><br>
           <pre>确认密码 </pre><input type="password" name="_Password" id="_Password"><br><br>
           
           <button type="submit" name="submit" style="width:80px;height:30px;"  onclick="check();">submit</button><br>
           
              
     </form>
</div>


</body>
</html>