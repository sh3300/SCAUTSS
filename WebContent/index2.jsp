<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>添加酒店(测试)</h2>
  <form action="<c:url value="/hotel/addHotel.action" />" method="post">
	类型：<br/>
	<input type="text" name="types" /><br/>
	名称：<br/>
	<input type="text" name="names" /><br/>
	星级：<br/>
	<input type="text" name="levels" /><br/>
	房间数：<br/>
	<input type="text" name="roomNumber" /><br/>
	<input type="submit" value="添加" /><br/>
  </form>
  <hr>
  <h2>酒店列表(测试)</h2>
  <a href="<c:url value='/hotel/queryHotel.action' />">酒店列表(测试)</a>
  
</body>
</html>