<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${result}">
		<h1>파일 업로드가 되었습니다.</h1>
		<h3>
			TITLE : ${title}<br> 파일 이름 : ${saveFileName}
		</h3> 
		<img alt="프로필 사진" src="<c:url value="/upload/${saveFileName}"/>">
	</c:if>
	
	<c:if test="${!result}">
		<h1>파일 업로에 문제가 발생했습니다. 다시 시도해주세요.</h1>
	</c:if>

</body>
</html>