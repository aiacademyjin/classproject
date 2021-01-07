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
	<h1>주문 정보</h1>
	
	<h3>상품 주문 정보</h3>
	<c:forEach items="${userOrder.orderItems}" var="orderItem">
		<div>
			상품ID : ${orderItem.itemId} / 개수 : ${orderItem.number} 개 / 주의사항 : ${orderItem.remark}
		</div>
	</c:forEach>
	
	<h3>배송지</h3>
	<div>
		우편번호 : ${userOrder.address.zipcode}   / 주소 : ${userOrder.address.address1} ${userOrder.address.address2} 
	</div>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>