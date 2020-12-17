<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
		Cookie cookie = new Cookie("userId", "hot");
		response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>쿠키 userId의 값이 변경되었습니다.</h1>
	<a href="viewCookie.jsp">쿠키 정보 확인</a>

</body>
</html>