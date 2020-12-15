<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Result</title>
</head>
<body>

	<h1>Request Result</h1>
	<hr>

	<table>
		<tr>
			<td>이름</td>
			<td> <%= request.getParameter("userName") %> </td>
		</tr>
		<tr>
			<td>직업</td>
			<td>
				<%= request.getParameter("job") %>
			</td>
		</tr>
		<tr>
			<td>관심사항</td>
			<td>
			
				<%
					
					String[] interests = request.getParameterValues("interest");
				
					for(int i=0; i<interests.length; i++){
						out.println(interests[i]+"<br>");
					}
				
				%>
				
			</td>
		</tr>
	</table>


</body>
</html>















