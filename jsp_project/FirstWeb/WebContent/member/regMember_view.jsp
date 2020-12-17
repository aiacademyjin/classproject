<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		Member member = (Member) request.getAttribute("memberInfo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입입 완료되었습니다.</h1>
	<h3>
			ID : <%= member.getUserId() %>, <br>
			PW : <%= member.getPw() %>, <br>
			Name : <%= member.getUserName() %> , <br>
			Photo : <%= member.getPhoto() %>
	
	</h3>
</body>
</html>