<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>loginForm</title>
</head>
<body>
<h3>测试@ModelAttribute注释void返回值</h3>
<form action="login5" method="post">
	<table>
		<tr>
			<td><label>登录名：</label></td>
			<td><input type="text" id="loginname" name="loginname" ></td>
		</tr>
		<tr>
			<td><label>密码：</label></td>
			<td><input type="text" id="password" name="password" ></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="登录" ></td>
		</tr>
	</table>
</form>
</body>
</html>