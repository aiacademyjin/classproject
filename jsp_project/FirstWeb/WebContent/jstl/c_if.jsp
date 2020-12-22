<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="msg" value="user1"/>
	msg : ${msg} <br>
	
	<c:if test="${msg=='user1'}" var="result1">
	  test 속성의 값이 true일때 출력 : ${result1}   
	</c:if>
	<br>
	<c:if test="${msg ne 'user1'}" var="result2">
	  test 속성의 값이 true일때 출력 : ${result}   
	</c:if>
	${result2}
	
	<br>
	
	<c:set var="number" value="0"/>
	
	<c:choose>
		<c:when test="${number > 0}">
			양수입니다.
		</c:when>
		<c:when test="${number < 0}">
			음수입니다.
		</c:when>
		<c:otherwise>
			0입니다.
		</c:otherwise>
	</c:choose>


</body>
</html>





