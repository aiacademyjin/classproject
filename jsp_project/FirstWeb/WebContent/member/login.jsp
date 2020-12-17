<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		// 데이터 받기 : 아이디, 비밀번호
		String userId = request.getParameter("userid");
		String pw = request.getParameter("pw");
		
		// beans 생성
		Member member = new Member();
		
		// 데이터 바인딩
		member.setUserId(userId);
		member.setPw(pw);
		
		//데이터 공유 : request의 속성을 이용
		request.setAttribute("login", member);
		
		// login_view.jsp로 포워딩
%>

<jsp:forward page="login_view.jsp"/>


