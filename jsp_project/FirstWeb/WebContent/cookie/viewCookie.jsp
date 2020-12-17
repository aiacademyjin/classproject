<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
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
%>
</body>
</html>