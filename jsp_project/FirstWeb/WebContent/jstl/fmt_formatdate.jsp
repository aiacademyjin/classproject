<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	${now}
	
	<fmt:timeZone value="Hongkong">
	<br>
	<fmt:formatDate value="${now}" />
	<br>
	<fmt:formatDate value="${now}" type="date" />
	<br>
	<fmt:formatDate value="${now}" type="date" dateStyle="full" />
	<br>
	<fmt:formatDate value="${now}" type="date" dateStyle="short" />
	<br>
	<fmt:formatDate value="${now}" type="time" />
	<br>
	<fmt:formatDate value="${now}" type="time" timeStyle="full" />
	<br>
	<fmt:formatDate value="${now}" type="time" timeStyle="short" />
	<br>
	<fmt:formatDate value="${now}" type="both"/>
	<br>
	<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/>

	<br>
	패턴 : 
	<fmt:formatDate value="${now}" pattern="z a h:mm" /><br>
	<fmt:formatDate value="${now}" pattern="hh:mm" /><br>
	<fmt:formatDate value="${now}" pattern="yyyy.MM.dd h:mm"  /><br>
	<fmt:formatDate value="${now}" pattern="yyyy.MM.dd h:mm" timeZone="Hongkong" /><br>
	
	</fmt:timeZone>












</body>
</html>