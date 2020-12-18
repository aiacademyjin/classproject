<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int result = (Integer) request.getAttribute("result");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		if(result>0){
			out.println("<h1>데이터가 등록되었습니다.</h1>");
		} else {
			out.println("<h1>데이터 등록 실패했습니다.</h1>");
		}
	%>



</body>
</html>