<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
<link rel="styleSheet" href="${url_defaultCss}">
<style>
	.table {
		/* border: 1px solid #DDD; */
		width : 100%;
	}
	
	td, th {
		border-bottom: 1px solid #DDD;
		text-align: center;
		padding: 10px 0; 
	}
	
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	<div class="contents">
		<h2 class="content_title">회원 리스트</h2>
		<hr>
		<div class="content"> 
			
			<table class="table">
				<tr>
					<th>idx</th>
					<th>Member ID</th>
					<th>Member Name</th>
					<th>Member Photo</th>
					<th>Member RegistDate</th>
				</tr>
				
				
				<tr>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
					<td>1</td>
				</tr>
				
			</table>			
			
		</div>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp"%>

</body>
</html>