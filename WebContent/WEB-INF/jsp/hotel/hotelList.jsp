<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>酒店列表</title>
</head>
<body>
	
	<center>
	<h2>酒店列表（测试）</h2>
	<table border="1">
		<tr>
			<th>酒店名</th>
			<th>类型</th>
			<th>星级</th>
			<th>创建时间</th>
			<th>房间数</th>
			<th>地点</th>
			<th>删除状态</th>
		</tr>
		<c:forEach items="${hotelList }" var="hotel">
		<tr>
			<td>${hotel.names }</td>
			<td>${hotel.types }</td>
			<td>${hotel.levels }</td>
			<td>${hotel.times }</td>
			<td>${hotel.roomNumber }</td>
			<td>${hotel.position }</td>
			<td>${hotel.deleted }</td>
		</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>