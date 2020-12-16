<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="resultPage.jsp">
		페이지 이동 테스트 
		<select name="select">
			<option value="0">forward</option>
			<option value="1">sendRedirect</option>
		</select>
		<input type="submit">

	</form>

</body>
</html>