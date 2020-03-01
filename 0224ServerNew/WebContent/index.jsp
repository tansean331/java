<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<form action="Test">
		登录：<input type="text" name="from-username" id="username"/><span id="msg"></span>
		<br/>
		密码：<input type="password" name="from-password" id="password"/>
		<br/>
		确认密码：<input type="password" name="from-repassword" id="repassword"/><span id="pswdmsg" style="color: red;"></span>
		<br/>
		<input type="submit" value="注册"/>
	</form>
	
</body>
	<script type="text/javascript">
		$("#username").blur(function(){
			var name = $(this).val();
			if(name == null || name.length == 0)
			{
				alert("用户名为空");
				return;
			}
			$.ajax({
				type:"post",
				url:"Test",
				data:{
					"username":name
				},
				success:function(response){
					$("#msg").empty();
					$("#msg").text(response);
				}
			})
		})
		$("#repassword").blur(function(){
			var pswd = $("#password").val();
			var repswd = $(this).val();
			if((pswd == null || pswd.length == 0) && (repswd == null || repswd.length == 0)){
				alert("密码为空");
				return;
			}
			if(pswd != repswd){
				$("#pswdmsg").empty();
				$("#pswdmsg").text("密码不一致，请重新输入");
			}
			else{
				$("#pswdmsg").empty();
			}
		})
	</script>
</html>