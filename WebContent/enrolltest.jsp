<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/SCAUTSS/tourist/enroll" method="post">
  <p>账号： <input type="text" name="account" /></p>
  <p>密码： <input type="password" name="accountPassword" /></p>
  <p>再次输入密码： <input type="password" name="repassword"/></p>
  <p>邮箱 <input type="text" name="email"></p>
  <p>手机号 <input type="text" name="phoneNumber"></p>
  <label><input name="registerType" type="radio" value="1" />邮箱注册 </label> 
  <label><input name="registerType" type="radio" value="2" />手机号注册</label><br>
  <input type="submit" value="注册" />
</form>
</body>
</html>