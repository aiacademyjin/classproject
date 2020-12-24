<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:url value="/css/default.css" var="url_defaultCss" scope="application" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="styleSheet"
	href="${pageContext.request.contextPath}/css/default.css"> --%>
<link rel="styleSheet" href="${url_defaultCss}">
<style>
</style>
</head>
<body>

	<%@ include file="/include/header.jsp"%>

	<%@ include file="/include/nav.jsp"%>

	<div class="contents">
		<h2 class="content_title">회원 리스트</h2>
		<hr>
		<div class="content">

			<table border="1">
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이름</th>
					<th>사진</th>
					<th>가입일시</th>
				</tr>

				<c:if test="${empty memberList}">
				<tr>
					<td colspan="5">회원정보가 없습니다.</td>
				</tr>
				</c:if>
				
				<c:if test="${!empty memberList}">
				
				<c:forEach items="${memberList}" var="member">
				<tr>
					<td>${member.userId}</td>
					<td>${member.password}</td>
					<td>${member.userName}</td>
					<td> 
						<img alt="회원 프로필 사진" height="50" src="<c:url value="/upload/member/${member.userPhoto}"/>">
					</td>
					<td>
						<fmt:formatDate value="${member.date}" pattern="yyyy.MM.dd HH:mm:ss"/>
					</td>				
				</tr>
				</c:forEach>
				
				</c:if>
				
				
			</table>



		</div>
	</div>

	<%@ include file="/include/footer.jsp"%>












</body>
</html>