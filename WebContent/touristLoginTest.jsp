<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
<form action="/SCAUTSS/tourist/touristlogin" method="post">
  <p>账号： <input type="text" name="account" /></p>
  <p>密码： <input type="password" name="password" /></p>
  <input type="submit" value="登录" />
</form>
</body>
</html>