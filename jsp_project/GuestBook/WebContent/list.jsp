<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>방명록 작성</h3>
	<form action="writeMessage.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="guestName" > </td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"> </td>
			</tr>
			<tr>
				<td>메시지</td>
				<td>
					<textarea name="message" rows="5" cols="30"></textarea> 
				</td>
			</tr>
			<tr>
				<td></td>
				<td> <input type="submit" value="글쓰기"> <input type="reset"> </td>
			</tr>
		</table>
	</form>
	
	
	
	
	
	
	
</body>
</html>