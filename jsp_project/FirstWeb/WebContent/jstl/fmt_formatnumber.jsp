<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<fmt:formatNumber value="1000000"  />
	<fmt:formatNumber value="1000000" groupingUsed="false"  />
	
	<c:set var="number" value="10000000"/>
	
	<br>
	<fmt:formatNumber value="${number}"  />
	<fmt:formatNumber var="formatNumber" value="${number}"/>
	<br>
	${formatNumber}
	
	<br>
	
	통화 : <fmt:formatNumber value="${number}" type="currency" currencySymbol="$" />
	<br>
	퍼센트 :  <fmt:formatNumber value="${number/50000000}" type="percent" groupingUsed="false"/>
	<br>
	팬턴 : <fmt:formatNumber value="${number}" pattern="00,000,000.00"/>
	
	
	
	
	
	
	
	
	
	
</body>
</html>