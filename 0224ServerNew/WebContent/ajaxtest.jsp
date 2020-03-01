<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div id="divs">
	</div>
	<button>点击加载</button>
</body>
	<script type="text/javascript">
		//定义变量
		//js弱类型
		var a = ["123",true,1.0];
		//json
		var obj={
				id:10,
				name:"张三",
				age:8
		}
		console.log(obj.id);
		for(var i = 0; i < a.length; i++)
		{
			console.log(a[i]);	
		}
/* 		$("button").click(function(){
			$("#divs").load('ajax.txt',function(response){
				console.log(response);
			})
		}) */
		$("button").click(function(){
			$.ajax({
				type:"post",
				url:"Ajax",
				success:function(response){
					console.log(response);
					$("#divs").empty();
					$("#divs").text(response);
				}
			})
		})
	</script>
</html>