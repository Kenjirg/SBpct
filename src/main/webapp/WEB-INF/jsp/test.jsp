<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<a href="intro">回首頁</a>．<a href="t1">T1</a>
</head>
<body>
	<div>
		TEST
	</div><BR>
	<% session.setAttribute("a", "b"); %>
	<%= session.getId()%><BR>
	a:<%= session.getAttribute("a") %><BR>
	aa:<%= session.getAttribute("aa") %><BR>
	<BR><BR>
	<div></div>
</body>
</html>