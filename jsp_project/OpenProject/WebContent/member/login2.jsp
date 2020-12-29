<%@page import="member.service.MemberLoginService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자 요청에 맞는 서비스 클래스의 인스턴스 생성 -> 메소드 실행
	// 사용자 요청에 맞는 View를 선택해서 Forward
	MemberLoginService service = MemberLoginService.getInstance();
	service.memberLogin(request, response);

%>
<jsp:forward page="loginView.jsp"/>
