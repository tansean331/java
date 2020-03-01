<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
	<h2>修改页面</h2>
	<form action="UpdateServ">
	<div class="form-group">
	    <label for="exampleInputEmail1">需要修改的ID:</label>
	    <span>${sessionScope.id}</span>
	  </div>
	  <div class="form-group">
	    <label for="exampleInputEmail1">请输入修改的用户名:</label>
	    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="username" name="username">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1">请输入修改的密码:</label>
	    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
	  </div>
	  <button type="submit" class="btn btn-primary">点击提交</button>
	</form>
</body>
</html>