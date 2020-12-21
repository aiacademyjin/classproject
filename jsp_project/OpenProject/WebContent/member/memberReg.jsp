<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// DAO 객체의 insert 메소드로 member참조변수 전달, Connection 객체의 참조변수 전달

	Connection conn = ConnectionProvider.getConnection();
	
	if (conn != null) {
		// 폼의 입력한 사용자 입력 데이터의 한글 처리
		request.setCharacterEncoding("utf-8");
	
		String userId = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String userName = request.getParameter("username");
		String userPhoto = request.getParameter("userPhoto");
	
		Member member = new Member();
		member.setUserId(userId);
		member.setPassword(pw);
		member.setUserName(userName);
		member.setUserPhoto(userPhoto);
	
	}
%>











