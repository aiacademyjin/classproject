<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 메시지를 삭제하시려면 비밀번호를 입력해주세요.</h3>
	<form action="delete.jsp" method="post">
		비밀번호 <input type="password" name="pw"> 
		<input type="hidden" name="mid" value="${param.mid}"> 
		<input type="submit">
	</form>
</body>
</html>