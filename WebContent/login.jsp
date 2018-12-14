<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"  type="text/css"  href="css/login .css"/>
<script type="text/javascript">
    function check(){
    	var name=document.getElementById("Username").value;
    	var pwd=document.getElementById("Password").value;
    	if((name=="")||(name==null)){
    		alert("请输入用户名");
    		
    		return;
    	}else if((pwd=="")||(pwd==null)){
    		alert("请输入密码！");
    		
    		return;
    	}else{
    		form.submit();
    	}
    	 	
    }
</script>
<title>Login_page</title>
</head>
<body>

	<div class="top">
	   <div class="top-hotel-name">
	   <img alt=" " src="img/logo 2.png" height="100" width="200">
	   </div>
	   <div class="login"></div>
	   <div class="refresh"></div>
	</div>
	
	<div class="form"  >
	     <form action="<%=request.getContextPath()%>/LoginServlet" method="post">
	           <pre>用户名</pre><input type="tel" name="Username" id="Username" /><br>
	           <pre>密  码  </pre><input type="password" name="Password" id="Password"/><br>
	           
	           
	           <button type="submit" name="submit" id="submit" style="width:80px;height:30px;"
	                    onclick="check();">submit</button><br>
	           <a href="register.jsp">注册账号？</a>
	              
	     </form>
	</div>

</body>
</html>