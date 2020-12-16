<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>
<body>

	<%
		String select = request.getParameter("select");
		int selectNum = Integer.parseInt(select);	
		
		if(selectNum>0){
			out.println(selectNum);
			
			// 현재 페이지가 응답을 처리가 되고, result.jsp 페이지를 다시 요청
			response.sendRedirect("result.jsp");
			
		} else {
			out.println(selectNum);
			%>
			
			<!-- 현재 페이지가 응답으로 처리되는것 아니고, result.jsp 페이지의 결과가 응답으로 처리 -->
			<jsp:forward page="result.jsp"></jsp:forward>
			
			<%
		}
	%>
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>