<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<a href="intro">回首頁</a>．<a href="signOut">登出</a>
</head>
<body>
	<div>
		你好．${player.name}<BR>
		<a href="stt">更新狀態</a><BR>
		<div>事件：(${notice})</div>
	</div>
		<div></div>
		<div>等級/${player.lv}．HP/${player.hp}．MP/${player.mp}</div>
		<div><a href="catchACard">抽卡</a></div>
		<div><!-- POCKET -->
			<table border="1">
				<tr><!-- h -->
					<th>卡片</th><th></th><th></th>
				</tr>
				<tr><!-- 1 -->
					<td>No. ${player.pocket0001}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 2 -->
					<td>No. ${player.pocket0002}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 3 -->
					<td>No. ${player.pocket0003}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 4 -->
					<td>No. ${player.pocket0004}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 5 -->
					<td>No. ${player.pocket0005}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 6 -->
					<td>No. ${player.pocket0006}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 7 -->
					<td>No. ${player.pocket0007}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 8 -->
					<td>No. ${player.pocket0008}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 9 -->
					<td>No. ${player.pocket0009}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
				<tr><!-- 10 -->
					<td>No. ${player.pocket0010}</td><td><a href="">使用</a></td><td><a href="">丟棄</a></td>
				</tr>
			</table>
		</div>
	<BR><BR>
	<div></div>
</body>
</html>