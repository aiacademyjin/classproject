<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>
</head>
<body>

	<h1>회원 리스트</h1>
	<h3>전체 회원 : ${memberCnt}명</h3>
	<hr>
	
	
	<table border="1">
		<tr>
			<th>idx</th>
			<th>아이디</th>
			<th>이름</th>
			<th>비밀번호</th>
			<th>사진</th>
			<th>가입일</th>
		</tr>
		
		<c:forEach items="${members}" var="member">
		<tr>
			<td>${member.idx}</td>
			<td>${member.memberid}</td>
			<td>${member.membername}</td>
			<td>${member.password}</td>
			<td>${member.memberphoto}</td>
			<td>${member.regdate}</td>
		</tr>
		</c:forEach>
	</table>
	

</body>
</html>