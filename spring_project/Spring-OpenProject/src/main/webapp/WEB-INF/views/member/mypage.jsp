<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>
<style>
	img {
		width:100px;
		border-radius: 50%;
	}
</style>
</head>
<body >
	<%@ include file="/WEB-INF/views/include/header.jsp"  %>
	<%@ include file="/WEB-INF/views/include/nav.jsp"  %>
	<div class="contents">
		<h2 class="content_title">My Page</h2>
		<hr>
		<div class="content">
		My Page 입니다.<br>
		${loginInfo} <br>
		<img alt="회원사진" src="<c:url value="/fileupload/member/${loginInfo.memberphoto}"/>"> 
		</div>
	</div>
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>