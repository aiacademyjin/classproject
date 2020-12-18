<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글 처리
	request.setCharacterEncoding("utf-8");

	// 데이터받고
	String deptno = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	

	Connection conn=null;

	//1. 드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//2. DB 연결 : Connection 객체를 얻어온다.
	String jdbcUrl = "jdbc:mysql://localhost:3306/open?serverTimezone=UTC";
	String user = "aia";
	String password = "aia";
	
	conn = DriverManager.getConnection(jdbcUrl, user, password);
	
	
	String sql_insert = "insert into dept values(?, ?, ?)";
	
	PreparedStatement pstmt = conn.prepareStatement(sql_insert);
	pstmt.setInt(1, Integer.parseInt(deptno));
	pstmt.setString(2, dname);
	pstmt.setString(3, loc);
	
	int resultCnt = pstmt.executeUpdate();
	
	request.setAttribute("result", resultCnt);
	
	// -> insert_view
%>


<jsp:forward page="insert_view.jsp"/>








