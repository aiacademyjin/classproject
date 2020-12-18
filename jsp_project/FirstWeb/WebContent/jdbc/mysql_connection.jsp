<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 모든 JAVA API를 사용할 수 있다.  
	
	Connection conn=null;

	//1. 드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//2. DB 연결 : Connection 객체를 얻어온다.
	String jdbcUrl = "jdbc:mysql://localhost:3306/open?serverTimezone=UTC";
	String user = "aia";
	String password = "aia";
	
	conn = DriverManager.getConnection(jdbcUrl, user, password);
	
	out.println("<h1>mysql 연결</h1>");
	
	// Statement
	Statement stmt = conn.createStatement();
	
	// SQL
	String sql_Dept = "select * from dept";
	
	ResultSet rs = stmt.executeQuery(sql_Dept);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mysql Connection</title>
</head>
<body>

	<h1>부서 리스트</h1>
	
	<!-- 부서번호, 부서이름, 위치 -->
	<table border="1">
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>위치</th>
		</tr>
		<%
		
		while(rs.next()){		
		%>
		<tr>
			<td><%= rs.getInt(1) %></td>
			<td><%= rs.getString(2)%></td>
			<td><%= rs.getString("loc")%></td>
		</tr>
		<%
		}
		
		rs.close();
		stmt.close();
		conn.close();
		%>
	</table>













</body>
</html>