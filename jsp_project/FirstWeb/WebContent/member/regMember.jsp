<%@page import="member.model.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		// 사용자가 입력한 데이터의 한글 처리
		request.setCharacterEncoding("UTF-8");

		// 데이터를 받고
		String userId = request.getParameter("userid");
		String pw = request.getParameter("pw"); 
		String userName = request.getParameter("username");
		
		// beans 생성
		Member member = new Member();
		
		// beans에 데이터 바인딩
		member.setUserId(userId);
		member.setPw(pw);
		member.setUserName(userName);
		
		// beans를 request 내장 객체의 속성에 저장 -> view 페이지에 데이터 공유(전달)
		request.setAttribute("memberInfo", member);
		
		// view 페이지로 forwarding		
%>

<jsp:forward page="regMember_view.jsp" />










