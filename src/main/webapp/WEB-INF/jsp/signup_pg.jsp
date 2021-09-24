<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<a href="intro">回首頁</a>．<a href="test">test</a>
</head>
<body>
	<div>
		註冊<BR>
		<div>${notice}</div><BR><BR>
		<form action="signUp" method="post">
			<label>名稱：</label> <input type="text" name="sup_usrname"><BR>
			<label>密碼：</label> <input type="text" name="sup_password"><BR>
			<input type="submit" value="送出">
		</form>
	</div><BR>
	<BR><BR>
	<div></div>
</body>
</html>