<%@page import="guestbook.service.WriteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="message" class="guestbook.model.Message">
	<jsp:setProperty name="message" property="*" />
</jsp:useBean>
<%
	WriteMessageService service = WriteMessageService.getInstance();
	int result = service.writeMessage(message);
%>
<c:set var="result" value="<%= result %>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${result>0}">
	<h3>입력되었습니다. <br>${message}</h3>
	</c:if>
	
	<c:if test="${result<1}">
	<h3>입력실패. 다시 시도해주세요. </h3>
	</c:if>

	
	<a href="<c:url value="/list.jsp"/>">목록보기</a>
	

</body>
</html>




