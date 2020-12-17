<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 쿠키의 유지 시간을 0으로 설정 : 삭제
	Cookie cookie = new Cookie("userId","");
	cookie.setMaxAge(0); // 유지 시간을 0으로 설정
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키 값을 삭제했습니다.</h1>
	<a href="viewCookie.jsp">쿠키 정보 확인</a>
	
</body>
</html>