<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询页面</title>
<!-- 
	BootStrap.css
	jQuery.js
	BootStrap.js
 -->
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
	
	<h1>查询所有用户</h1>
	<table class="table table-hover">
  		<thead>
  			<th>用户ID</th>
  			<th>用户名</th>
  			<th>用户密码</th>
  			<th>注册日期</th>
  			<th>修改</th>
  			<th>删除</th>
  		<thead>
  		<tbody>
  			<!-- EL表达式 -->
  			<!-- JSTL标签 -->
  			<!-- 
  				for(String str:list){
  					System.out.print(str);
  				}
  			 -->
  			<c:forEach items="${requestScope.list}" var="user" >
  				<tr>
	  				<td>${user.id}</td>
	  				<td>${user.userName}</td>
	  				<td>${user.passWord}</td>
	  				<td>${user.regDate}</td>
	  				<td><a href="UpdateServ?id=${user.id}"><button class="btn btn-primary">修改</button></a></td>
  					<td><a href="DeleteServ?id=${user.id}"><button class="btn btn-primary">删除</button></a></td>
  				</tr>
  			</c:forEach>
  		</tbody>
	</table>	
</body>
</html>