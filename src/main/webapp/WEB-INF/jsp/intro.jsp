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
		登入<BR>
		<div>${notice}</div><BR>
		<form action="signIn" method="post">
			<label>名稱：</label> <input type="text" name="sin_usrname"><BR>
			<label>密碼：</label> <input type="text" name="sin_password"><BR>
			<input type="submit" value="送出">
		</form>
	</div><BR>
	<div>
		<a href="signup_pg">註冊新會員</a>
	</div>
	<BR><BR>
	<div></div>
</body>
</html>