<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forTokens var="phoneNum" items="010-9999-7777" delims="-" varStatus="stat">
		<input type="text" name="phoneNum${stat.count}" value="${phoneNum}">
		<c:if test="${stat.count < 3}">-</c:if>
	</c:forTokens>


</body>
</html>