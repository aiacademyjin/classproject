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
		} else {
			out.println(selectNum);
		}
	%>

</body>
</html>