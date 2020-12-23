<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	CookieBox cookieBox = new CookieBox(request);

	String saveId = cookieBox.exists("uid") ? cookieBox.getValue("uid") : "";
	String checked = cookieBox.exists("uid") ? " checked " : "";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styleSheet" href="${url_defaultCss}">
<style>
</style>
</head>
<body>


	<%@ include file="/include/header.jsp"%>

	<%@ include file="/include/nav.jsp"%>

	<div class="contents">
		<h2 class="content_title">Login Form</h2>
		<hr>
		<div class="content">
			<form action="login.jsp" method="post">
				<table>
					<tr>
						<th><label for="userid">아이디</label></th>
						<td><input type="text" id="userid" name="userid"
							value="<%=saveId%>"></td>
					</tr>
					<tr>
						<th><label for="pw">비밀번호</label></th>
						<td><input type="password" id="pw" name="pw"></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="checkbox" name="chk" value="on"
							<%=checked%>> 아이디 저장</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="로그인"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

	<%@ include file="/include/footer.jsp"%>












</body>
</html>