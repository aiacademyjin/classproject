<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Date time = new Date();

	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 출력</title>
</head>
<body>

	<h1>세션 정보</h1>
	<h3>
		세션 ID : <%= session.getId()%><br>
		세션 생성 시간 : <%= session.getCreationTime() %>, <%= format.format(session.getCreationTime()) %> <br>
		최근 접속 시간 : <%= session.getLastAccessedTime() %>, <%= format.format(session.getLastAccessedTime())%>
	</h3>
	
</body>
</html>












