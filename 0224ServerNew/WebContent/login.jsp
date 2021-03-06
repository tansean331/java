<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
	<h1>注册成功！！！</h1>
	<h2>登录页面</h2>
	  <div class="form-group">
	    <label for="exampleInputEmail1">请输入用户名:</label>
	    <input type="text" class="form-control" placeholder="username" id="username">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1">请输入密码:</label>
	    <input type="password" class="form-control" placeholder="Password" id="password">
	  </div>
	  <button class="btn btn-primary" id="submit">点击登录</button>
	  <span style="color:red" id="msg"></span>
</body>
	<script type="text/javascript">
	$("#submit").click(function(){
		var username = $("#username").val();
		var pswd = $("#password").val();
		console.log(username);
		if((username != null || username.length != 0) && (pswd != null || pswd.length != 0))
		{
			console.log(username);
			console.log(pswd);
			$.ajax({
				type:"post",
				url:"LoginServ",
				data:{
					"username":username,
					"password":pswd
				},
				success:function(response){
					$("#msg").empty();
					if(response)
					{
						 window.location.href = 'LoginToWebinfo';
					}
				}
			})
		}else{
			alert("用户名或密码为空");
			return;
		}
		
	})
	
	</script>
</html>