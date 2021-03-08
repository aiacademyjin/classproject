<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${not loginCheck}">
<script>
	alert("아이디 또는 비밀번호가 틀립니다. 다시 로그인해주세요. ");
	history.go(-1);
</script>
</c:if>
<c:if test="${loginCheck}">
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
		<h2 class="content_title">Login</h2>
		<hr>
		<div class="content">
		
		<c:if test="${msg ne null}">
		${msg}
		</c:if>
		
		<c:if test="${msg eq null}">
		로그인 되었습니다. <br>
		<%-- <%= loginInfo %> --%>
		${loginInfo} <br>
		<img alt="회원사진" src="<c:url value="/fileupload/member/${loginInfo.memberphoto}"/>"> 
		</c:if>
		
		</div>
		
		
		
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>

</body>
</html>
</c:if>