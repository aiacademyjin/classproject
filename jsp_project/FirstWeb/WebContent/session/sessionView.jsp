<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 속성값 확인</title>
</head>
<body>

	<h1>세션의 속성에 저장된 userName : <%= session.getAttribute("userName")%></h1>
	<h1>세션의 속성에 저장된 userName : ${sessionScope.userName}</h1>
	<h1><a href="../index.jsp">index로 이동</a></h1>

</body>
</html>




