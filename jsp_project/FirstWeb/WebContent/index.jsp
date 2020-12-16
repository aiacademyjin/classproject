<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
	<h1>INDEX : <%= session.getAttribute("userName") %></h1>
	<ul>
		<li><a href="/FirstWeb/test/now.jsp">/FirstWeb/test/now.jsp(절대경로)</a></li>
		<li><a href="test/now.jsp">test/now.jsp(상대경로)</a></li>
		<li><a href="test/msword.jsp">test/msword.jsp</a></li>
		<li><a href="request/requestForm.jsp">request/requestForm.jsp</a></li>
		<li><a href="response/selectPage.jsp">response/selectPage.jsp</a></li>
		<li><a href="session/session.jsp">session/session.jsp</a></li>
		<li><a href="attribute/applicationAttrSet.jsp">attribute/applicationAttrSet.jsp</a></li>
		<li><a href="attribute/requestAttrSet.jsp">attribute/requestAttrSet.jsp</a></li>
	</ul>
</body>
</html>