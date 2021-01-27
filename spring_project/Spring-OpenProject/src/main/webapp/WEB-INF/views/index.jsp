<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="styleSheet"
	href="${pageContext.request.contextPath}/css/default.css"> --%>
<%-- <link rel="styleSheet" href="<c:url value="/css/default.css"/>"> --%>
<%@ include file="/WEB-INF/views/include/basicset.jsp"%>
<style>
</style>
</head>
<body class="bg-light">



	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<main class="container">
		<div
			class="d-flex align-items-center p-3 my-3 text-white bg-purple rounded shadow-sm">
			<div class="lh-1">
				<h1 class="h2 mb-0 text-white lh-1">Index</h1>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded shadow-sm">
			<h3 class="border-bottom pb-2 mb-0">Recent updates</h3>
			<div class="d-flex text-muted pt-3">
					INDEX				
			</div>
		</div>
	</main>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>










<script>
<c:if test="${param.type eq 'delete'}">
<c:if test="${param.result eq 'ok'}">
alert('로그아웃되었습니다.');	
</c:if>
<c:if test="${param.result ne 'ok'}">
alert('처리과정에서 오류가 발생했습니다.');
</c:if>
</c:if>
	
</script>

</body>
</html>