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

	<c:url value="/index.jsp"/> <br>
	<c:url value="index.jsp"/> <br>
	<c:url value="/index.jsp" var="indexLink"/>
	${indexLink} <br>
	<c:url value="/index.jsp">
		<c:param name="pageNUmber" value="1"/>
		<c:param name="keyword" value="jstl"/>
	</c:url>
	

</body>
</html>