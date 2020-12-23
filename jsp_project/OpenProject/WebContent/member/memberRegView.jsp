<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
	int result = (Integer) request.getAttribute("result");
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styleSheet" href="${url_defaultCss}">
<style>
</style>
</head>
<body >


	<%@ include file="/include/header.jsp"  %>
		
	<%@ include file="/include/nav.jsp"  %>
	
	<div class="contents">
		<h2 class="content_title">회원 가입 </h2>
		<hr>
		<div class="content">
		
		<c:if test="${result > 0}">
		정상적으로 회원가입이 되었습니다. 
		</c:if>
		
		<c:if test="${result eq 0}">
		회원가입이 정상 처리되지 않았습니다. 다시 시도해주세요. 
		</c:if>
		
		
		
		<%--
			if(result>0){
				out.println("정상적으로 회원가입이 되었습니다. ");
			} else {
				out.println("회원가입이 정상 처리되지 않았습니다. 다시 시도해주세요.");
			}
		--%>
		
		</div>
	</div>
	
	<%@ include file="/include/footer.jsp" %>

	
	
	
	
	
	
	
	
	


</body>
</html>