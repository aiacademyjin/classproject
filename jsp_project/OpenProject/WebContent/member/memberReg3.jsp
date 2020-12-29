<%@page import="member.service.MemberRegService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// MemberregService
	// insertMember(HttpServletRequest request) -> int 1 or 0 

	MemberRegService service = MemberRegService.getInstance();
	service.insertMember(request);
		
	// memberReg3.jsp 역할
	// 사용자의 요청에 맞는 서비스 클래스 선택 -> 메소드 실행
	// View 페이지를 선택 -> 포워드
	
%>
<jsp:forward page="memberRegView.jsp" />











