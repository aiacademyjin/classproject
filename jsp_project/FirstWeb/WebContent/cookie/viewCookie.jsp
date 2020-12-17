<%@page import="util.CookieBox"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	CookieBox cookieBox = new CookieBox(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

userId=<%= cookieBox.getValue("userId") %><br>
age=<%= cookieBox.getCookie("age").getValue() %> <br>
nicName 이 존재하는지 여부 : <%= cookieBox.exists("nicName") %>

<%--
		Cookie[] cookies = request.getCookies();

		if(cookies != null && cookies.length>0){
			for(int i=0; i<cookies.length ; i++){
				String name = cookies[i].getName();
				String value = URLDecoder.decode(cookies[i].getValue(), "utf-8");
				
				out.println("<h1>"+name+"="+value+"</h1>");
			}
		} else {
			out.println("<h1>저장된 쿠키가 없습니다.</h1>");
		}
--%>



		<h1><a href="editCookie.jsp">쿠키 수정</a></h1>
		<h1><a href="deleteCookie.jsp">쿠키 삭제</a></h1>








</body>
</html>