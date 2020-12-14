<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>

<%
	Date now = new Date(); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>now Date</title>
</head>
<body>

	<h1>현재 시간 : <%= now %></h1>
	<h1>컨텍스 경로 : <%= request.getContextPath() %></h1>
	
	<!-- http://localhost:8080/FirstWeb/now.jsp -->

</body>
</html>








